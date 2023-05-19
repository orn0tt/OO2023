package br.com.senai.exemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivoScanner {

	public static void main(String[] args) {

		File arquivo = new File("\\Aula\\exemplo.txt");
		Scanner sc = null;

		try {

			sc = new Scanner(arquivo);
			sc.useDelimiter(";");

			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}

		} catch (FileNotFoundException e) {

			System.out.println("Arquivo não encontrado!");
			e.printStackTrace();

		} finally {

			if (sc != null) {
				sc.close();

			}
		}
	}
}