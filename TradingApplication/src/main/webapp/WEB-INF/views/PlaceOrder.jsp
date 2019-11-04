<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Stock List</h1>
		
		<table border="1">
		<tr>

			<th>Stock Id</th>
			<th>Name</th>
			<th>Quantity</th>
			<th>Price</th>
			<th>Brokerage</th>
			<th>Qty to Order</th>
			
</tr>

			<c:forEach var="stock" items="${stockList}">
				
<tr>
					<td>${stock.stockId}</td>
					<td>${stock.name}</td>
					<td>${stock.quantity}</td>
					<td>${stock.price}</td>
					<td>${stock.brokerage}</td>
				<td><a href="ToQty/${stock.stockId}">Buy</a></td>
	</tr>			
			</c:forEach>
			
		</table>
	</div>
	
</body>
</html>