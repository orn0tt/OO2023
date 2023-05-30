package br.com.senai.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactorySingleton {

	private static String urlConexao = "jdbc:postgresql://localhost:5432/cursobanco";
	private static String usuario = "postgres";
	private static String senha = "Gta@22450401";
	private static Connection connection = null;

	private static Connection newConnection() {

		Connection con = null;

		try {
			con = DriverManager.getConnection(urlConexao, usuario, senha);
		} catch (SQLException e) {
			System.out.println("Problemas no driver ou nos dados informados da conexão.");
			e.printStackTrace();
		}

		return con;
	}

	public static Connection getConnection() {

		if (connection == null) {
			connection = newConnection();
			System.out.println("Conectado com sucesso.");
		}

		return connection;
	}
}