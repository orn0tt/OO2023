package br.com.senai.conexao;

import java.sql.Connection;

public class TestarConexao {

	public static void main(String[] args) {

		Connection cf = new ConnectionFactory().getConnection();

	}
}