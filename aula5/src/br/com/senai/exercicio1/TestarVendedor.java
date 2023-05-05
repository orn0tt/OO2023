package br.com.senai.exercicio1;

import java.util.Scanner;

public class TestarVendedor {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		String escolha = "N";
		int opcao = 0;

		Fixo joana = new Fixo("Joana", "123123123", 2000, 250);
		Fixo maria = new Fixo("Maria", "234234234", 2000, 500);

		System.out.println("----------Sistema de Vendas----------");
		System.out.println("Vendedores:");
		System.out.println("1- Joana");
		System.out.println("2- Maria");

		while (escolha.equalsIgnoreCase("N")) {
			System.out.println("Escolha o vendedor: ");
			opcao = ler.nextInt();

			if (opcao == 1) {
				System.out.println("Digite o valor da venda: ");
				joana.calcularSalario(ler.nextDouble());

			}
			if (opcao == 2) {
				System.out.println("Digite o valor da venda: ");
				maria.calcularSalario(ler.nextDouble());
			}

			System.out.println("Deseja encerrar o programa? (S/N)");
			ler.nextLine();
			escolha = ler.nextLine();
		}
		ler.close();
		System.out.println("----------Salário dos Vendedores----------");
		System.out.println("Nome: Joana");
		System.out.println("Salário Bruto: " + joana.getSalarioBruto());
		System.out.println("Nome: Maria");
		System.out.println("Salário Bruto: " + maria.getSalarioBruto());
		System.out.println("----------Total Vendido----------");
		System.out.println("Total: " + Fixo.totalVenda);
	}
}