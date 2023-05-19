package br.com.senai.exemplos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestarContarCaracteres {

	public static void main(String[] args) {

		try {

			BufferedReader bf = new BufferedReader(new FileReader("\\Aula\\disciplinas.txt"));

			int quantidade = 0;
			int quantidadeTotal= 0;
			try {
				while (bf.ready()) {

					String linha = bf.readLine();
					quantidade = linha.length();

					 quantidadeTotal += linha.length();

					System.out.println("Quantidade de caracteres: " + quantidade);
				}
				System.out.println("Quantidade total de caracteres: " + quantidadeTotal);
				bf.close();
			} catch (IOException e) {

				System.err.println("Erro na leitura do arquivo.");
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}
}