<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Lista de clientes</title>
</head>
<body>

<h1>Página de clientes</h1>

<p>Esta es la lista de clientes</p>

<dl>

	<c:forEach var="i" items="${misClientes}">
	
		<dt>${ i.nombre} ${ i.apellido } </dt>
		<dd>Correo: ${ i.email }</dd>
		<dd>Número Id: ${ i.id }</dd>
		<br />
		<br />
	
	</c:forEach>

</dl>

</body>
</html>