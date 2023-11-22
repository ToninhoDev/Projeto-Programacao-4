<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   
<!DOCTYPE html>
<html>
<head>

	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

<title>Inserir Novo Livro</title>
</head>
<body>

<a href = "voltar">Voltar</a>

<h1 class="h1">Inserir Novo Livro</h1>
<br>

<form name= "formInserirLivro" action="insert" >
<br>
<input class="form-control" type="text" name="nome" placeholder="Nome Do Livro">
<br>
<input class="form-control" type="text" name="autor" placeholder="Nome Do Autor">
<br>
<input class="form-control" type="text" name="editora" placeholder="Nome Da Editora">
<br>
<input class="form-control" type="text" name="genero" placeholder="Genero do Livro">
<br>
<input class="form-control" type="text" name="numeroPaginas" placeholder="Numero de Paginas do Livro">
<br>
<input class="form-control" type="text" name="dataPublicacao" placeholder="Data da Publicacao do Livro">
<br>
<br>

<input class="btn btn-primary" type="submit" value="Cadastrar">


</form>

</body>
</html>