
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="conection.DAO" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<title>Avaliação de Livros</title>
<title></title>
</head>
<body>

<h1 class="h1"> Login de Usuario </h1>

<br>
<form name= "formInserirUsuario" action="" >
<br>
<input class="form-control" type="text" name="nomeUsuario" placeholder="Nome Do Usuario">
<br>
<input class="form-control" type="text" name="emailUsuario" placeholder="E-mail">
<br>


<input class="btn btn-primary" type="submit" value="Entrar">

<br>
<br>
<br>

<a href="main">Acessar</a>

<br>
<br>
<br>
<a href="NovoUsuario.jsp">Novo Usuario</a>
</form>
</body>
</html>