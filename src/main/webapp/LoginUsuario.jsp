
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="conection.DAO" %>
<!DOCTYPE html>
<html>
<head>

	<meta charset="utf-8">
	<link rel="stylessheet" href="style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
	
<title>Avaliação de Livros</title>
<title></title>
</head>
<body>
<div class="container">
<h1 class="h1"> Login de Usuario </h1>


<br>
<form name= "formInserirUsuario" action="Controller" method="post" >
<br>
<input class="form-control" type="text" name="emailUsuario" placeholder="E-mail">
<br>
<input class="form-control" type="password" name="senhaUsuario" placeholder="Senha">
<br>

<input class="btn btn-primary" type="submit" value="Entrar">

<br>
<br>
<a class="btn" href="NovoUsuario.jsp">Novo Usuario</a>
</form>
</div>
</body>
</html>