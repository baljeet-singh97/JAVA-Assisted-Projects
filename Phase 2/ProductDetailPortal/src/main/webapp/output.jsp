<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
		<h2>Product Display</h2>
			
	<table  border=1 cellspacing=0 cellpadding=10>
	<tr>
		 
			<th>Product ID</th><th>Product Name</th><th>Product Category</th><th>Product Price</th>
		
	</tr>
	<tr>
	<td><c:out value="${product.productId }"></c:out></td>
	<td><c:out value="${product.productName }"></c:out></td>
	<td><c:out value="${product.productCategory }"></c:out></td>
	<td><c:out value="${product.productPrice }"></c:out></td>

	</tr>
</table>
		<br>
		<br>
		<a href="index.jsp">Display more products</a>
	</div>
	

	
	
</body>
</html>