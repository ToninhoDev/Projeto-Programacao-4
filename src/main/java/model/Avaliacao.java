package model;

public class Avaliacao {
	
	private String avaliacao;
	private Usuario usuario;
	private Livro livro;
	
	
	public Avaliacao() {
		super();
	}


	public Avaliacao(String avaliacao, Usuario usuario, Livro livro) {
		super();
		this.avaliacao = avaliacao;
		this.usuario = usuario;
		this.livro = livro;
	}


	public String getAvaliacao() {
		return avaliacao;
	}


	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public Livro getLivro() {
		return livro;
	}


	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	
	

	
	
	
	

}
