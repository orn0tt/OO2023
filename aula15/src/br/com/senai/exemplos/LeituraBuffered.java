package br.com.senai.exemplos;

import java.io.BufferedReader;
import java.io.FileReader;

public class LeituraBuffered {

	public static void main(String[] args) {

		try {

			FileReader fr = new FileReader("\\Aula\\exemplo.txt");

			BufferedReader bf = new BufferedReader(fr);

			while (bf.ready()) {
				System.out.println(bf.readLine());
			}
			
			bf.close();
			
		} catch (Exception e) {
			System.out.println("Erro ao ler o arquivo.");
		}
	}
}