package net.muzz.choc.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.muzz.choc.dao.chockDAO;
import net.muzz.choc.model.chock;


@WebServlet("/")
public class ChocolateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private chockDAO chockDAO;
	
	
       

    public ChocolateServlet() {
        this.chockDAO=new chockDAO();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertChocolate(request, response);
				break;
			case "/delete":
				deleteChocolate(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateChocolate(request, response);
				break;
			default:
				listChocolate(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
		
		
	}
	
	private void listChocolate(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<chock> listChocolate = chockDAO.selectAllChocolate();
		request.setAttribute("listChocolate", listChocolate);
		RequestDispatcher dispatcher = request.getRequestDispatcher("chocolate-list.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("chocolate-form.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		chock existingChocolate = chockDAO.selectChocolate(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("chocolate-form.jsp");
		request.setAttribute("chock", existingChocolate);
		dispatcher.forward(request, response);

	}

	private void insertChocolate(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String prd_name = request.getParameter("prd_name");
		float price = Float.parseFloat(request.getParameter("price"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		chock newChock = new chock(prd_name,price,quantity);
		chockDAO.insertChocolate(newChock);
		response.sendRedirect("list");
	}

	private void updateChocolate(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String prd_name = request.getParameter("prd_name");
		float price = Float.parseFloat(request.getParameter("price"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		chock newChock = new chock(id,prd_name,price,quantity);
		chockDAO.updateChocolate(newChock);
		response.sendRedirect("list");
	}

	private void deleteChocolate(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		chockDAO.deleteChocolate(id);
		response.sendRedirect("list");

	}


	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
		
	}

}
