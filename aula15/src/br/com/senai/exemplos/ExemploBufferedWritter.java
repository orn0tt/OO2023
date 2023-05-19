package br.com.senai.exemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploBufferedWritter {

	public static void main(String[] args) {

		String[] disciplinas = { "Java", "React", "Angular", "PHP", "Delphi" };
		String caminho = "C:\\Aula\\disciplinasnovas.txt";

		try {

			BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true));

			for (String d : disciplinas) {
				bw.write(d);
				bw.newLine();
			}

			bw.close();
			System.out.println("Arquivo criado com sucesso.");
		} catch (IOException e) {

			System.err.println("Arquivo não foi criado.");
			e.printStackTrace();
		}
	}
}