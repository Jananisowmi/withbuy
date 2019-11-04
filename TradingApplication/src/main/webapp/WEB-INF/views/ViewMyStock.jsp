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
<h2>QtyAvail is ${qtyAvail}</h2>
 <form:form action="" modelAttribute="stock">
 <form:input path="name"/>
 <form:input path="quantity"/>
 <input type="submit" value="Buy"/>
	
	
</form:form>
</body>
</html>