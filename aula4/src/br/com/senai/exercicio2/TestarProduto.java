package br.com.senai.exercicio2;

import java.util.Scanner;

public class TestarProduto {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String escolha = "S";

		while (escolha.equalsIgnoreCase("S")) {
			Produto produto = new Produto();

			System.out.println("Produto: ");
			produto.setDescricao(ler.next());

			System.out.println("Valor: ");
			produto.setValor(ler.nextDouble());

			System.out.println("Quantidade: ");
			produto.setQuantidade(ler.nextInt());

			System.out.println("Descrição: " + produto.getDescricao() + "\nValor: " + produto.getValor() + "\nTotal: "
					+ (produto.getQuantidade() * produto.getValor()) + "\nICMS: " + produto.calcularIcms());

			System.out.println("Deseja continuar? (S/s)");
			ler.nextLine();
			escolha = ler.nextLine();
		}
		ler.close();
	}
}