package br.com.senai.exemplos;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class LerArquivoBinario {

	public static void main(String[] args) {

		try {
			FileInputStream arquivo = new FileInputStream("\\Aula\\dados.bin");
			DataInputStream lerArquivo = new DataInputStream(arquivo);
			String resultado = lerArquivo.readUTF();
			System.out.println(resultado);
			lerArquivo.close();
		} catch (IOException e) {
			System.out.println("Arquivo não encontrado.");
			e.printStackTrace();
		}
	}
}