function confirmar(idLivro){
	let resposta = confirm("Confirmar Exclusão deste Livro?");
	
	if(resposta === true){
		window.location.href = "delete?id=" + idLivro;
	}
}