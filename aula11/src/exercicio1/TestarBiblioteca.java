package exercicio1;

import java.util.Scanner;

public class TestarBiblioteca {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Scanner scString = new Scanner(System.in);

		Biblioteca b = new Biblioteca("Gabriel");

		int opcao = '5';

		while (opcao != 5) {

			b.menu();
			opcao = sc.nextInt();

			switch (opcao) {

			case 1:

				System.out.println("*******ADICIONAR LIVRO*******");

				System.out.println("Digite o título do livro: ");
				String titulo = scString.nextLine();

				System.out.println("Digite o autor do livro: ");
				String autor = scString.nextLine();

				System.out.println("Digite o preço do livro: ");
				double preco = sc.nextDouble();

				Livro livro = new Livro(titulo, autor, preco);

				b.adicionar(livro);

				break;

			case 2:

				System.out.println("*******LISTA DE LIVROS*******");

				b.listar();

				break;

			case 3:

				System.out.println("*******PESQUISA POR PREÇO*******");

				System.out.println("Digite a faixa de preço do livro");

				System.out.println("Valor inicial: ");
				double precoI = sc.nextDouble();

				System.out.println("Valor final: ");
				double precoF = sc.nextDouble();

				b.pesquisarFaixaDePreco(precoI, precoF);

				break;

			case 4:

				System.out.println("*******VALOR TOTAL*******");

				System.out.println("O total do patrimônio de livros é: R$" + b.calcularTotalLivros());

				break;

			default:

				break;
			}
		}
		sc.close();
		scString.close();
	}
}