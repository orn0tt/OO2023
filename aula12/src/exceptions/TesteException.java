package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Digite os dados: ");
			String[] vetor = sc.nextLine().split(";");

			// Uma possível exception
			System.out.println("Insira a posição do vetor para impressão: ");
			int posicao = sc.nextInt();

			System.out.println(vetor[posicao]);

			System.out.println("-----Dados vetor-----");

			for (String s : vetor) {
				System.out.println(s);
			}

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Você tentou acessar uma índice inválido.");

		} catch (InputMismatchException e) {

			System.out.println("Você digitou um caracter no lugar de um número.");

		} finally {

			sc.close();
			System.out.println("Final de programa.");

		}
	}
}