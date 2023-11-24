<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="model.Livro"%>
<%@ page import="java.util.ArrayList"%>
<%
ArrayList<Livro> lista = (ArrayList<Livro>) request.getAttribute("livros");

%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

<title>LIVROS</title>
</head>
<body>

	<h1 class="h1">Livros</h1>
	<br>
	<br>
	<a href="sair">Sair</a>
	
	<table class="table align-items-center table-borderless">
		<thead class="table-primary">
			<tr>				
				<th scope="col">NOME</th>
				<th scope="col">AUTOR</th>
				<th scope="col">EDITORA</th>
				<th scope="col">GENERO</th>
				<th scope="col">NUMEDO DE PAGINAS</th>
				<th scope="col">DATA DA PUBLICAÇÃO</th>
				<th scope="col">OPÇÕES</th>
				<th></th>
				<th></th>

			</tr>
		</thead>

		<tbody>

			<%
			for (int i = 0; i < lista.size(); i++) {
			%>
			<tr>
			
			<td><%=lista.get(i).getNome()%></td>
			<td><%=lista.get(i).getAutor()%></td>
			<td><%=lista.get(i).getEditora()%></td>
			<td><%=lista.get(i).getGenero()%></td>
			<td><%=lista.get(i).getNumeroPaginas()%></td>
			<td><%=lista.get(i).getDataPublicacao()%></td>
			<td><a class="btn btn-primary" href="selecionarLivro?id=<%=lista.get(i).getId()%>">EDITAR</a></td>
			<td><a class="btn btn-danger" href="javascript:confirmar(<%=lista.get(i).getId()%>)">EXCLUIR</a></td>	
			<td><a class="btn btn-secondary" href="avaliarLivro?idAvaliar=<%=lista.get(i).getId()%>">AVALIAR</a></td>
			<td></td>
			</tr>
			<%
			}
			%>
		</tbody>
		
		<script src= "SCRIPTS/confirmador.js"></script>
	</table>
		<br>
		<a class="btn btn-primary" href="novoLivro.jsp">Novo Livro</a>

</body>
</html>