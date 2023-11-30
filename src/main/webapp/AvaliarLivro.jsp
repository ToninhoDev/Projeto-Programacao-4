<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<link rel="stylessheet" href="style.css">
<title>Avaliar Livro</title>
</head>
<body>
<div class="container">

	<a id="botaoVoltar" class="btn btn-danger" href="voltar">voltar</a>
	<br>
	<br>
	<h1>Avaliar Livro</h1>	
	<br>
	<table class="table align-items-center table-borderless">
	<thead class="table-primary">
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
	<form action="inserirAvaliacao">
	<br>
	<h3>Avaliação</h3>
	
	<textarea name="inserirAvaliacao" rows="10" cols="70"></textarea>
	<!-----<input name="inserirAvaliacao" type="text" placeholder="Avaliação">--->
	<br>
	<button class="btn btn-success type="submit" value="Avaliar">Avaliar</button>	
	</form>
	</div>
</body>
</html>