package br.com.senai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.senai.conexao.ConnectionFactorySingleton;
import br.com.senai.entity.Produto;
import br.com.senai.interfaces.CrudGenerico;

public class ProdutoDAO implements CrudGenerico<Produto> {

	private Connection connection;

	public ProdutoDAO() {
		connection = ConnectionFactorySingleton.getConnection();
	}

	@Override
	public List<Produto> listar() {

		String sql = "SELECT * FROM tb_produto";
		List<Produto> produtos = new ArrayList<>();

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Produto produto = new Produto(rs.getInt("codigo_produto"), rs.getString("nome"),
						rs.getString("descricao"), rs.getDouble("preco"), rs.getInt("quantidade_estoque"));
				produtos.add(produto);
			}
			rs.close();
			stmt.close();
			// connection.close();
		} catch (SQLException e) {
			System.err.println("Erro ao listar dados.");
			e.printStackTrace();
		}
		return produtos;
	}

	public List<Produto> listarPorNome(String nome, int tipoBusca) {

		String sql;
		if (tipoBusca == 1) {
			sql = "select * from tb_produto where nome like '" + nome + "%'";
		} else if (tipoBusca == 2) {
			sql = "select * from tb_produto where nome like '%" + nome + "%'";
		} else {
			sql = "select * from tb_produto where nome like '%" + nome + "'";
		}

		List<Produto> produtos = new ArrayList<>();

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Produto produto = new Produto(rs.getInt("codigo_produto"), rs.getString("nome"),
						rs.getString("descricao"), rs.getDouble("preco"), rs.getInt("quantidade_estoque"));
				produtos.add(produto);
			}
			rs.close();
			stmt.close();
			// connection.close();
		} catch (SQLException e) {
			System.err.println("Erro ao listar dados.");
			e.printStackTrace();
		}
		return produtos;
	}

	@Override
	public Produto buscar(int codigo) {
		return null;
	}

	@Override
	public void inserir(Produto t) {

		String sql = "INSERT INTO tb_produto(nome,descricao,preco,quantidade_estoque) values (?,?,?,?)";

		try {

			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, t.getNome());
			stmt.setString(2, t.getDescricao());
			stmt.setDouble(3, t.getPreco());
			stmt.setInt(4, t.getQuantidadeEstoque());
			stmt.execute();
			stmt.close();
			// connection.close();

			System.out.println("Registro gravado com sucesso.");

		} catch (SQLException e) {
			System.err.println("Erro ao gravar registro.");
			e.printStackTrace();
		}
	}

	@Override
	public void atualizar(Produto t) {

	}

	@Override
	public void remover(int codigo) {

	}
}