package br.com.senai.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private String urlConexao = "jdbc:postgresql://localhost:5432/cursobanco";

	private String usuario = "postgres";

	private String senha = "Gta@22450401";

	private Connection connection;

	public Connection getConnection() {

		System.out.println("Conectando ao banco de dados.");

		try {
			connection = DriverManager.getConnection(urlConexao, usuario, senha);
			if (connection != null) {
				System.out.println("Conectado com sucesso.");
			} else {
				System.out.println("Não foi possível conectar ao banco");
			}
		} catch (SQLException e) {
			System.out.println("Problemas no driver da conexão.");
			e.printStackTrace();
		}

		return connection;
	}
}