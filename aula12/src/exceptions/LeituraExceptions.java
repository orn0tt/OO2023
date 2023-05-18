package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeituraExceptions {

	public static void main(String[] args) {

		try {

			String[] vetor = { "Celular", "TV", "Kindle" };

			FileReader fr = new FileReader("c:\\Aula\\texto.txt");

			System.out.println("Arquivo encontrado.");
			System.out.println(vetor[9]);
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
			// e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Índice fora de faixa.");
		} finally {
			System.out.println("Final de programa.");
		}
	}
}