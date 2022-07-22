<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Chocolate</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-light"
			style="background-color: black">
			<div>
				<a href="index.html" style="color:white" class="navbar-brand"> Chocolate
					Inventory Management </a>
			</div>

			<ul class="navbar-nav">
				<li><a style="color:white" href="<%=request.getContextPath()%>/list"
					class="nav-link">Chocolate Inventory</a></li>
			</ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${chock != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${chock == null}">
					<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${chock != null}">
            			Edit chock
            		</c:if>
						<c:if test="${chock == null}">
            			Add New chocolate
            		</c:if>
					</h2>
				</caption>

				<c:if test="${chock != null}">
					<input type="hidden" name="id" value="<c:out value='${chock.id}' />" />
				</c:if>

				<fieldset class="form-group">
					<label>Chocolate Name</label> <input type="text"
						value="<c:out value='${chock.prd_name}' />" class="form-control"
						name="prd_name" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Chocolate Price</label> <input type="text"
						value="<c:out value='${chock.price}' />" class="form-control"
						name="price">
				</fieldset>

				<fieldset class="form-group">
					<label>Chocolate Quantity</label> <input type="text"
						value="<c:out value='${chock.quantity}' />" class="form-control"
						name="quantity">
				</fieldset>

				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
