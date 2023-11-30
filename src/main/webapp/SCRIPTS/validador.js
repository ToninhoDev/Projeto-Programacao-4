function validar(){
	
	
	let nomeLivro = formInserirLivro.nome.value;
	let autorLivro = formInserirLivro.autor.value;
	let editoraLivro = formInserirLivro.editora.value;
	let generoLivro = formInserirLivro.genero.value;
	let numeroPaginas = formInserirLivro.numeroPaginas.value;
	let dataPublicacao = formInserirLivro.dataPublicacao.value;
	
	if(nomeLivro === ""){
		alert("Preencha o Campo Nome!")
		document.formInserirLivro.nome.focus();
		return false
	}else if(autorLivro === ""){
		alert("Preencha o Campo Autor do Livro!")
		formInseriLivro.autor.focus()
		return false
	}else if(editoraLivro === ""){
		alert("Preencha o Campo Editora!")
		formInseriLivro.editora.focus()
		return false
	}else if(generoLivro === ""){
		alert("Preencha o Campo Genero do Livro!")
		formInseriLivro.genero.focus()
		return false
	}else if(numeroPaginas === ""){
		alert("Preencha o Campo Numero de Paginas")
		formInseriLivro.numeroPaginas.focus()
		return false
	}else if(dataPublicacao === ""){
		alert("Preencha o Campo Data da Publicação!")
		formInseriLivro.dataPublicacao.focus()
		return false
	}else{
		document.forms["formInserirLivro"].submit;
	}
}