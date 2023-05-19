package br.com.senai.exercicio2;

import java.util.Scanner;

public class Split {
	public static void main(String[] args) {

		// Leitura do texto
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o texto: ");
		String texto = sc.nextLine();

		// Remoção dos traços e apresentação das palavras
		String[] palavras = texto.split("-");
		for (String p : palavras) {
			System.out.print(p + " ");
		}
		sc.close();
	}
}
