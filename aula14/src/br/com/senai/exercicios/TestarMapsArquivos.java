package br.com.senai.exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JOptionPane;

public class TestarMapsArquivos {

	public static void main(String[] args) {

		String caminhoDoArquivo, linha, nome;

		double salario, totalSalario = 0;

		Map<String, Double> funcionarios = new TreeMap<>();

		caminhoDoArquivo = JOptionPane.showInputDialog("Insira o caminho do arquivo");

		try {

			BufferedReader br = new BufferedReader(new FileReader(caminhoDoArquivo));
			linha = br.readLine();

			while (linha != null) {

				String[] dados = linha.split(";");
				nome = dados[0];
				salario = Double.parseDouble(dados[1]);
				funcionarios.put(nome, salario);
				linha = br.readLine();

			}

			for (Map.Entry<String, Double> f : funcionarios.entrySet()) {

				System.out.println(f);
				totalSalario += f.getValue();
			}

			JOptionPane.showMessageDialog(null, "Total da folha de pagamento" + totalSalario, "Resultado", 1);

		} catch (IOException e) {

			JOptionPane.showMessageDialog(null, "Erro na leitura do arquivo", "Erro", 0);
		}
	}
}