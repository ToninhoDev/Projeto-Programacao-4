package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Livro;
import model.Usuario;

public class DAO {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/livro?userTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "root";

	private Connection conectar() {
		Connection con = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		}

		catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public void testeConecxao() {

		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void inserirLivro(Livro livro) {
		String inserir = "insert into cdlivro (nome, autor, editora, genero, numero_paginas, dataPublicacao) values (?,?,?,?,?,?)";

		try {
			Connection con = conectar();

			PreparedStatement stmt = con.prepareStatement(inserir);

			stmt.setString(1, livro.getNome());
			stmt.setString(2, livro.getAutor());
			stmt.setString(3, livro.getEditora());
			stmt.setString(4, livro.getGenero());
			stmt.setString(5, livro.getNumeroPaginas());
			stmt.setString(6, livro.getDataPublicacao());

			stmt.execute();

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public ArrayList<Livro> listarLivros() {

		ArrayList<Livro> livro = new ArrayList<>();

		String listarLivros = "select * from cdlivro";

		try {
			Connection con = conectar();

			PreparedStatement stmt = con.prepareStatement(listarLivros);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt(1);
				String nome = rs.getString(2);
				String autor = rs.getString(3);
				String editora = rs.getString(4);
				String genero = rs.getString(5);
				String numeroPaginas = rs.getString(6);
				String dataPublicacao = rs.getString(7);

				livro.add(new Livro(id, nome, autor, editora, genero, numeroPaginas, dataPublicacao));

			}
			con.close();
			return livro;
		} catch (Exception e) {
			System.out.println(e);
		}

		return null;
	}

	public void selecionarLivro(Livro livro) {
		String buscar = "select * from cdLivro where idLivro=?";

		try {
			Connection con = conectar();

			PreparedStatement stmt = con.prepareStatement(buscar);

			stmt.setInt(1, livro.getId());

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				livro.setId(rs.getInt(1));
				livro.setNome(rs.getString(2));
				livro.setAutor(rs.getString(3));
				livro.setEditora(rs.getString(4));
				livro.setGenero(rs.getString(5));
				livro.setNumeroPaginas(rs.getString(6));
				livro.setDataPublicacao(rs.getString(7));
			}
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void alterarLivro(Livro livro) {
		String alterar = "update cdLivro set nome=?, autor=?, editora=?, genero=?, numero_paginas=?, dataPublicacao=? where idLivro=?";

		try {

			Connection con = conectar();

			PreparedStatement stmt = con.prepareStatement(alterar);

			stmt.setString(1, livro.getNome());
			stmt.setString(2, livro.getAutor());
			stmt.setString(3, livro.getEditora());
			stmt.setString(4, livro.getGenero());
			stmt.setString(5, livro.getNumeroPaginas());
			stmt.setString(6, livro.getDataPublicacao());
			stmt.setInt(7, livro.getId());

			stmt.executeUpdate();

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void deletarLivro(Livro livro) {
		String deletarLivro = "delete from cdLivro where idLivro = ?";

		try {

			Connection con = conectar();

			PreparedStatement stmt = con.prepareStatement(deletarLivro);

			stmt.setInt(1, livro.getId());

			stmt.executeUpdate();

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void cadastrarUsuario(Usuario usuario) {

		String isUsuario = "insert into usuario (nome, email, idade, senha) values (?,?,?,?)";

		try {

			Connection con = conectar();

			PreparedStatement stmt = con.prepareStatement(isUsuario);

			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getEmail());
			stmt.setString(3, usuario.getIdade());
			stmt.setString(4, usuario.getSenha());

			stmt.execute();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
