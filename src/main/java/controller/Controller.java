package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import conection.DAO;
import model.Livro;
import model.Usuario;

@WebServlet(urlPatterns = { "/Controller", "/main", "/insert", "/selecionarLivro", "/update", "/delete", "/cadastrarUsuario", "/sair", 
		"/voltar", "/avaliarLivro" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	Livro livro = new Livro();
	Usuario usuario = new Usuario();

	public Controller() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/main")) {
			livros(request, response);
		} else if (action.equals("/insert")) {
			novoLivro(request, response);
		} else if (action.equals("/selecionarLivro")) {
			selecionarLivro(request, response);
		}else if (action.equals("/update")) {
			alterarLivro(request, response);
		}else if (action.equals("/delete")) {
			deletarLivro(request, response);
		}else if (action.equals("/cadastrarUsuario")) {
			cadastrarUsuario(request, response);
		}else if (action.equals("/sair")) {
			sairUsuario(request, response);
		}else if (action.equals("/voltar")) {
			voltar(request, response);
		}else if (action.equals("/avaliarLivro")) {
			avaliarLivro(request, response);
		}
		else {
			response.sendRedirect("LoginUsuario.jsp");
		}
	}

	protected void livros(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<Livro> listarLivros = dao.listarLivros();

		request.setAttribute("livros", listarLivros);
		RequestDispatcher rd = request.getRequestDispatcher("Livros.jsp");
		rd.forward(request, response);

		//response.sendRedirect("novoLivro.jsp");
	}

	protected void novoLivro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		livro.setNome(request.getParameter("nome"));
		livro.setAutor(request.getParameter("autor"));
		livro.setEditora(request.getParameter("editora"));
		livro.setGenero(request.getParameter("genero"));
		livro.setNumeroPaginas(request.getParameter("numeroPaginas"));
		livro.setDataPublicacao(request.getParameter("dataPublicacao"));

		dao.inserirLivro(livro);

		response.sendRedirect("main");
	}
	
	protected void selecionarLivro(HttpServletRequest request, HttpServletResponse resposnse) throws ServletException, IOException {
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
	
	protected void alterarLivro(HttpServletRequest request, HttpServletResponse resposnse) throws ServletException, IOException {
		
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
	protected void deletarLivro(HttpServletRequest request, HttpServletResponse resposnse) throws ServletException, IOException{
		String idLivro = request.getParameter("id");
		livro.setId(Integer.parseInt(idLivro));
		dao.deletarLivro(livro);
		
		resposnse.sendRedirect("main");
	}
	
	protected void cadastrarUsuario(HttpServletRequest request, HttpServletResponse resposnse) throws ServletException, IOException{
		
		usuario.setNome(request.getParameter("nomeUsuario"));
		usuario.setEmail(request.getParameter("emailUsuario"));
		usuario.setIdade(request.getParameter("idadeUsuario"));
		usuario.setSenha(request.getParameter("senhaUsuario"));
		
		dao.cadastrarUsuario(usuario);
		
	resposnse.sendRedirect("LoginUsuario.jsp");
	}
	
	protected void sairUsuario(HttpServletRequest request, HttpServletResponse resposnse) throws ServletException, IOException{
		resposnse.sendRedirect("LoginUsuario.jsp");
	}
	protected void voltar(HttpServletRequest request, HttpServletResponse resposnse) throws ServletException, IOException{
		resposnse.sendRedirect("main");
	}
	
	protected void avaliarLivro(HttpServletRequest request, HttpServletResponse resposnse) throws ServletException, IOException{
		String idLivro = request.getParameter("idAvaliar");
		System.out.println(idLivro);
		livro.setId(Integer.parseInt(idLivro));
		dao.selecionarLivro(livro);
		
		
		request.setAttribute("nome", livro.getNome());
		request.setAttribute("autor", livro.getAutor());
		
		RequestDispatcher rd = request.getRequestDispatcher("AvaliarLivro.jsp");
		rd.forward(request, resposnse);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emailUsuario =  request.getParameter("emailUsuario");
		String senhaUsuario = request.getParameter("senhaUsuario");
		
		
		
		usuario.setEmail(emailUsuario);
		usuario.setSenha(senhaUsuario);
		
		Usuario usuarioLogado = dao.loginUsuario(usuario);
		
		if(usuarioLogado != null) {
			response.sendRedirect("main");
		}else {
			response.sendRedirect("LoginUsuario.jsp");
		}
			
		
	}
	

}
