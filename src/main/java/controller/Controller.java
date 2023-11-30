package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.LivrosBean;
import conection.DAO;
import model.Avaliacao;
import model.Livro;
import model.Usuario;

@WebServlet(urlPatterns = { "/Controller", "/main", "/insert", "/selecionarLivro", "/update", "/delete",
		"/cadastrarUsuario", "/sair", "/voltar", "/avaliarLivro", "/inserirAvaliacao" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	Livro livro = new Livro();
	Usuario usuario = new Usuario();
	Avaliacao avaliacao = new Avaliacao();

	LivrosBean livrosBean = new LivrosBean();

	public Controller() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/main")) {
			livrosBean.livros(request, response);
		} else if (action.equals("/insert")) {
			livrosBean.novoLivro(request, response);
		} else if (action.equals("/selecionarLivro")) {
			livrosBean.selecionarLivro(request, response);
		} else if (action.equals("/update")) {
			livrosBean.alterarLivro(request, response);
		} else if (action.equals("/delete")) {
			livrosBean.deletarLivro(request, response);
		} else if (action.equals("/cadastrarUsuario")) {
			livrosBean.cadastrarUsuario(request, response);
		} else if (action.equals("/sair")) {
			livrosBean.sairUsuario(request, response);
		} else if (action.equals("/voltar")) {
			livrosBean.voltar(request, response);
		} else if (action.equals("/avaliarLivro")) {
			livrosBean.avaliarLivro(request, response);
		} else if (action.equals("/inserirAvaliacao")) {
			livrosBean.inserirAvaiacao(request, response);
		} else {
			response.sendRedirect("LoginUsuario.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String emailUsuario = request.getParameter("emailUsuario");
		String senhaUsuario = request.getParameter("senhaUsuario");

		usuario.setEmail(emailUsuario);
		usuario.setSenha(senhaUsuario);

		Usuario usuarioLogado = dao.loginUsuario(usuario);

		if (usuarioLogado != null) {

			response.sendRedirect("main");
		} else {
			response.sendRedirect("LoginUsuario.jsp");
		}

	}

}
