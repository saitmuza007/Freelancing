package net.muzz.choc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.muzz.choc.model.chock;

public class chockDAO {
	private String jdbcURL="jdbc:mysql://localhost:3306/chocolatestore?useSSL=false";
	private String jdbcUsername="root";
	private String jdbcPassword="root";
	
	private static final String INSERT_CHOCOLATE_SQL="INSERT INTO chocolate"+"(prd_name,price,quantity) VALUES"+"(?,?,?);";
	private static final String SELECT_ALL_CHOCOLATE_BY_ID="select id,prd_name,price,quantity from chocolate where id=?";
	private static final String SELECT_ALL_CHOCOLATE="select * from chocolate";
	private static final String DELETE_CHOCOLATE_SQL="delete from chocolate where id= ?;";
	private static final String UPDATE_CHOCOLATE_SQL="update chocolate set prd_name = ?,price = ?,quantity = ? where id = ?;";
	
	protected Connection getConnection()
	{
		Connection connection=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
			
		}
		return connection;
	}
	//Insert Query
	public void insertChocolate(chock chocolate) throws SQLException {
		System.out.println(INSERT_CHOCOLATE_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CHOCOLATE_SQL)) {
			preparedStatement.setString(1, chocolate.getPrd_name());
			preparedStatement.setFloat(2, chocolate.getPrice());
			preparedStatement.setInt(3, chocolate.getQuantity());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//Update Query
	public boolean updateChocolate(chock chocolate) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_CHOCOLATE_SQL);) {
			statement.setString(1, chocolate.getPrd_name());
			statement.setFloat(2, chocolate.getPrice());
			statement.setInt(3,chocolate.getQuantity());
			statement.setInt(4,chocolate.getId());

			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}
	//Select Chocolate by id
	
	public chock selectChocolate(int id) {
		chock chocolate = null;
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CHOCOLATE_BY_ID);) {
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				String prd_name = rs.getString("prd_name");
				Float price = rs.getFloat("price");
				int quantity = rs.getInt("quantity");
				chocolate = new chock (id, prd_name, price, quantity);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return chocolate;
	}
	
	public List<chock> selectAllChocolate() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<chock> chocolate = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();

				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CHOCOLATE);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int id = rs.getInt("id");
				String prd_name = rs.getString("prd_name");
				Float price = rs.getFloat("price");
				int quantity = rs.getInt("quantity");
				chocolate.add(new chock(id, prd_name, price, quantity));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return chocolate;
	}
	//Delete Chocolate
	
	public boolean deleteChocolate(int id) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_CHOCOLATE_SQL);) {
			statement.setInt(1, id);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}
	
}
