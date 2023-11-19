package model;

public class Livro {
	
	private Integer id;
	private String nome;
	private String autor;
	private String editora;
	private String genero;
	private String numeroPaginas;
	private String dataPublicacao;
	
	public Livro() {
		super();
		
	}

	public Livro(Integer id, String nome, String autor, String editora, String genero, String numeroPaginas,
			String dataPublicacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.genero = genero;
		this.numeroPaginas = numeroPaginas;
		this.dataPublicacao = dataPublicacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(String numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	
	
	
	

}
