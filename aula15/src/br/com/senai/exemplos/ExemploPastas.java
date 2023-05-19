package br.com.senai.exemplos;

import java.io.File;
import java.util.Scanner;

public class ExemploPastas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o caminho da pasta ou o nome do arquivo: ");
		String nomePastaArquivo = sc.nextLine();

		File file = new File(nomePastaArquivo);

		if (file.exists()) {

			if (file.isFile()) {

				System.out.printf("\nArquivo existe (%s) - tamanho: %d bytes\n", file.getName(), file.length());
			} else {

				System.out.println("\nConteúdo da pasta:\n");
				String[] pasta = file.list();
				for (String p : pasta) {
					System.out.printf("%s\n - %d",p, p.length());
				}
			}
		} else {
			System.out.println("Arquivo ou diretório não encontrado.");
		}
		
		System.out.println("Criar diretório - JavaExemplos");
		
		boolean sucesso = new File(file+"\\JavaExemplos").mkdir();
		
		System.out.println((sucesso?"Diretório criado.":"Diretório não foi criado."));
		
		sc.close();
	}
}