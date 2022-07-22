<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Chocolate Inventory Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-light"
			style="background-color:black">
			<div>
				<a href="index.html"style="color:white" class="navbar-brand"> Chocolate
					Inventory Management </a>
			</div>

			<ul class="navbar-nav ">
				<li><a style="color:white" href="<%=request.getContextPath()%>/list"
					class="nav-link">Chocolate Inventory</a></li>
			</ul>
			
			
		</nav>
	</header>
	<br>

	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">List of Chocolates</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add
					New Chocolate</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Price</th>
						<th>Quantity</th>
						<th>Net Worth</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<!--   for (Todo todo: todos) {  -->
					<c:forEach var="chock" items="${listChocolate}">

						<tr>
							<td><c:out value="${chock.id}" /></td>
							<td><c:out value="${chock.prd_name}" /></td>
							<td><c:out value="Rs.${chock.price}" /></td>
							<td><c:out value="${chock.quantity} Per/Unit" /></td>
							<td><c:out value="${chock.price * chock.quantity}"/></td>
							<td><button class="btn btn-primary"><a style="text-decoration:none;color:white"
							href="edit?id=<c:out value='${chock.id}' />">Edit</button></a>
								&nbsp;&nbsp;&nbsp;&nbsp;<button class="btn btn-danger"> <a style="text-decoration:none;color:white"
								href="delete?id=<c:out value='${chock.id}' />">Delete</button></a></td>
						</tr>
					</c:forEach>
					<!-- } -->
				</tbody>

			</table>
		</div>
	</div>
</body>
</html>
