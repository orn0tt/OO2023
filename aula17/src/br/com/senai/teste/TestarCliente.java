package br.com.senai.teste;

import java.util.Iterator;
import java.util.Scanner;

import br.com.senai.dao.ClienteDAO;
import br.com.senai.entity.Cliente;

public class TestarCliente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("Nome:"); String nome = sc.nextLine();
		 * 
		 * System.out.println("Telefone:"); String telefone = sc.nextLine();
		 * 
		 * System.out.println("Email:"); String email = sc.nextLine();
		 * 
		 * System.out.println("Código: "); Integer codigo = sc.nextInt();
		 * 
		 * Cliente cliente = new Cliente(codigo, nome, telefone, email);
		 * 
		 * ClienteDAO dao = new ClienteDAO();
		 * 
		 * // dao.inserirRegistro(cliente);
		 * 
		 * dao.atualizarRegistro(cliente); System.out.println("Atualização efetuada.");
		 */

		// Remover
		/*
		 * System.out.println("Digite o código para remover um cliente: "); Integer
		 * codigo = sc.nextInt(); ClienteDAO dao = new ClienteDAO();
		 * dao.remover(codigo); System.out.println("Cliente removido com sucesso.");
		 * sc.close();
		 */

		// Listar todos os clientes
		ClienteDAO dao = new ClienteDAO();
		for (Cliente c : dao.listarClientes()) {
			System.out.println(c);
		}
	}
}