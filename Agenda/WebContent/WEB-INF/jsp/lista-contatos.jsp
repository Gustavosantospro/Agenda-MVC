<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Contatos</title>
</head>
<body>
	
	<table>
		<c:forEach var=contato items="${contatos}">
			<tr>
				<td>${contato.nome}</td>
				<td>${contato.email}</td>
				<td>${contato.endereco}</td>
				<td><a href="mvc?logica=ListaContatosLogica&id=${contato.id}">Remover</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>