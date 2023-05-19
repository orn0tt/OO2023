package br.com.senai.exercicio1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestarPessoa {

	public static void main(String[] args) {

		// Leitura dos dados da pessoa
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("Digite o nome: ");
			String nome = br.readLine();

			System.out.print("Digite a idade: ");
			int idade = Integer.parseInt(br.readLine());

			System.out.print("Digite a altura: ");
			double altura = Double.parseDouble(br.readLine());

			// Escrita dos dados no arquivo binário
			try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("\\Aula\\pessoa.bin"))) {
				dos.writeUTF(nome);
				dos.writeInt(idade);
				dos.writeDouble(altura);
			} catch (IOException e) {
				System.err.println("Erro na escrita dos dados.");
				e.printStackTrace();
			}

			// Leitura dos dados do arquivo binário e apresentação no console
			try (DataInputStream dis = new DataInputStream(new FileInputStream("\\Aula\\pessoa.bin"))) {
				String nomeLido = dis.readUTF();
				int idadeLida = dis.readInt();
				double alturaLida = dis.readDouble();

				System.out.println("Nome: " + nomeLido);
				System.out.println("Idade: " + idadeLida);
				System.out.println("Altura: " + alturaLida);
			} catch (IOException e) {
				System.err.println("Erro na leitura do arquivo.");
				e.printStackTrace();
			}
		} catch (IOException e) {
			System.err.println("Erro na digitação dos dados.");
			e.printStackTrace();
		}
	}
}