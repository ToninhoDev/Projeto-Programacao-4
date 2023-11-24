<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Avaliar Livro</title>
</head>
<body>
	<h1>Avaliar Livro</h1>
	<br>

	<a href="voltar">voltar</a>
	<br>
	<br>
	<table>
	<thead>
	<tr>
	<th>Nome Do Livro</th>
	<th>Autor do Livro</th>
	</tr>
	</thead>
	<tbody>
	<tr>
	<td><%out.print(request.getAttribute("nome")); %></td>
	<td><%out.print(request.getAttribute("autor")); %></td>
	</tr>
	</tbody>
	</table>
</body>
</html>