package br.com.senai.exemplos;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class GravarArquivoBinario {

	public static void main(String[] args) {

		try {
			FileOutputStream arquivo = new FileOutputStream("\\Aula\\dados.bin");
			DataOutputStream gravarArquivo = new DataOutputStream(arquivo);

			gravarArquivo.writeChars("Senai - Curso de FullStack 2023 - teste");
			gravarArquivo.close();

		} catch (IOException e) {
			System.err.println("Problemas ao gravar o arquivo.");
			e.printStackTrace();
		}
	}
}