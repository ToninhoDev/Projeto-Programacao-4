<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<title class="h1">Editar Livro</title>
</head>
<body>


	<a href="LoginUsuario.jsp">Voltar</a>

	<h1>Editar Livro </h1>
	<br>
	<form name="formInserirLivro" action="update">
		<br> <input class="form-control" type="text" name="id" readonly="readonly" value="<%out.print(request.getAttribute("id")); %>">
		<br> <input class="form-control" type="text" name="nome" value="<%out.print(request.getAttribute("nome")); %>">
		<br> <input class="form-control" type="text" name="autor" value="<%out.print(request.getAttribute("autor")); %>">
		<br> <input class="form-control" type="text" name="editora" value="<%out.print(request.getAttribute("editora")); %>"> 
		<br> <input class="form-control" type="text" name="genero" value="<%out.print(request.getAttribute("genero")); %>"> 
		<br> <input class="form-control" type="text" name="numeroPaginas" value="<%out.print(request.getAttribute("numeroPaginas")); %>"> 
		<br> <input class="form-control" type="text" name="dataPublicacao" value="<%out.print(request.getAttribute("dataPublicacao")); %>"> 
		<br> 
		<br>

		<input class="btn btn-primary" type="submit" value="Editar">


	</form>

</body>
</html>