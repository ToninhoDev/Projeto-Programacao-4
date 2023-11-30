package bean;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import conection.DAO;
import model.Avaliacao;
import model.Livro;
import model.Usuario;

public class LivrosBean {

	DAO dao = new DAO();
	Livro livro = new Livro();
	Usuario usuario = new Usuario();
	Avaliacao avaliacao = new Avaliacao();

	public void livros(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArrayList<Livro> listarLivros = dao.listarLivros();

		request.setAttribute("livros", listarLivros);
		RequestDispatcher rd = request.getRequestDispatcher("Livros.jsp");
		rd.forward(request, response);

		// response.sendRedirect("novoLivro.jsp");
	}

	public void novoLivro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		livro.setNome(request.getParameter("nome"));
		livro.setAutor(request.getParameter("autor"));
		livro.setEditora(request.getParameter("editora"));
		livro.setGenero(request.getParameter("genero"));
		livro.setNumeroPaginas(request.getParameter("numeroPaginas"));
		livro.setDataPublicacao(request.getParameter("dataPublicacao"));

		dao.inserirLivro(livro);

		RequestDispatcher rd = request.getRequestDispatcher("main");
		rd.forward(request, response);

	}

	public void selecionarLivro(HttpServletRequest request, HttpServletResponse resposnse)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		System.out.println(id);
		livro.setId(Integer.parseInt(id));
		dao.selecionarLivro(livro);

		request.setAttribute("id", livro.getId());
		request.setAttribute("nome", livro.getNome());
		request.setAttribute("autor", livro.getAutor());
		request.setAttribute("editora", livro.getEditora());
		request.setAttribute("genero", livro.getGenero());
		request.setAttribute("numeroPaginas", livro.getNumeroPaginas());
		request.setAttribute("dataPublicacao", livro.getDataPublicacao());

		RequestDispatcher rd = request.getRequestDispatcher("EditarLivro.jsp");
		rd.forward(request, resposnse);

	}

	public void alterarLivro(HttpServletRequest request, HttpServletResponse resposnse)
			throws ServletException, IOException {

		livro.setId(Integer.parseInt(request.getParameter("id")));
		livro.setNome(request.getParameter("nome"));
		livro.setAutor(request.getParameter("autor"));
		livro.setEditora(request.getParameter("editora"));
		livro.setGenero(request.getParameter("genero"));
		livro.setNumeroPaginas(request.getParameter("numeroPaginas"));
		livro.setDataPublicacao(request.getParameter("dataPublicacao"));

		dao.alterarLivro(livro);

		resposnse.sendRedirect("main");

	}

	public void deletarLivro(HttpServletRequest request, HttpServletResponse resposnse)
			throws ServletException, IOException {
		String idLivro = request.getParameter("id");
		livro.setId(Integer.parseInt(idLivro));
		dao.deletarLivro(livro);

		resposnse.sendRedirect("main");
	}

	public void cadastrarUsuario(HttpServletRequest request, HttpServletResponse resposnse)
			throws ServletException, IOException {

		usuario.setNome(request.getParameter("nomeUsuario"));
		usuario.setEmail(request.getParameter("emailUsuario"));
		usuario.setIdade(request.getParameter("idadeUsuario"));
		usuario.setSenha(request.getParameter("senhaUsuario"));

		dao.cadastrarUsuario(usuario);

		resposnse.sendRedirect("LoginUsuario.jsp");
	}
	public void sairUsuario(HttpServletRequest request, HttpServletResponse resposnse) throws ServletException, IOException{
		resposnse.sendRedirect("LoginUsuario.jsp");
	}
	public void voltar(HttpServletRequest request, HttpServletResponse resposnse) throws ServletException, IOException{
		resposnse.sendRedirect("main");
	}
	
	public void avaliarLivro(HttpServletRequest request, HttpServletResponse resposnse) throws ServletException, IOException{
		String idLivro = request.getParameter("idAvaliar");
		System.out.println(idLivro);
		livro.setId(Integer.parseInt(idLivro));
		dao.selecionarLivro(livro);
		
		
		request.setAttribute("nome", livro.getNome());
		request.setAttribute("autor", livro.getAutor());
		
		RequestDispatcher rd = request.getRequestDispatcher("AvaliarLivro.jsp");
		rd.forward(request, resposnse);
		
	}
	
	public void inserirAvaiacao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String inserirAvaliacao = request.getParameter("inserirAvaliacao");
		
		avaliacao.setAvaliacao(request.getParameter(inserirAvaliacao));
		
		
		System.out.println(inserirAvaliacao);
		
		
		response.sendRedirect("inserirAvaliacao");
		

	}

}
