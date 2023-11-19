<%@ Dao dao = new Dao(); %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<title>Cadastro de Usuario</title>
</head>
<body>
<a href="LoginUsuario.jsp">Voltar</a>
<br>
<h1 class="h1">Inserir Novo Usuario</h1>
<br>

<form name= "formInserirUsuario" action="cadastrarUsuario" >
<br>
<input class="form-control" type="text" name="nomeUsuario" placeholder="Nome Do Usuario">
<br>
<input class="form-control" type="text" name="emailUsuario" placeholder="E-mail">
<br>
<input class="form-control" type="text" name="idadeUsuario" placeholder="Idade">
<br>
<input class="form-control" type="text" name="senhaUsuario" placeholder="Senha">
<br>
<br>


<input class="btn btn-primary" type="submit" value="Cadastrar">


</form>

</body>
</html>