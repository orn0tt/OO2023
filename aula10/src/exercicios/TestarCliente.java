package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestarCliente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char resp = 'S';

		List<Cliente> clientes = new ArrayList<>();
		Cliente cliente;
		do {

			System.out.println("Digite o seu id: ");
			int id = sc.nextInt();

			System.out.println("Digite o seu nome: ");
			String nome = sc.next();

			System.out.println("Digite o seu telefone: ");
			String telefone = sc.next();

			System.out.println("Digite sua idade: ");
			int idade = sc.nextInt();

			cliente = new Cliente(id, nome, idade, telefone);
			clientes.add(cliente);

			System.out.println("Digite (S/s) para continuar");
			resp = sc.next().charAt(0);

		} while (resp == 'S' || resp == 's');

		for (Cliente c : clientes) {
			System.out.println(c);
		}
	}
}