package br.com.senai.exercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class TestarProduto {

	public static void main(String[] args) {

		String caminhoDoArquivo, linha, nome, addProduto;

		Integer quantidade, totalQuantidade = 0;

		Map<String, Integer> produtos = new HashMap<>();

		caminhoDoArquivo = JOptionPane.showInputDialog("Insira o caminho do arquivo");

		try {

			BufferedReader br = new BufferedReader(new FileReader(caminhoDoArquivo));
			linha = br.readLine();

			while (linha != null) {

				String[] dados = linha.split(";");
				nome = dados[0].toLowerCase();
				quantidade = Integer.parseInt(dados[1]);

				if (produtos.containsKey(nome)) {

					int quantidadeAtual = produtos.get(nome);
					produtos.replace(nome, quantidadeAtual + quantidade);
				} else {

					produtos.put(nome, quantidade);
				}

				linha = br.readLine();
			}
		} catch (IOException e) {

			JOptionPane.showMessageDialog(null, "Erro na leitura do arquivo", "Erro", 0);
		}
		
		for (Map.Entry<String, Integer> p : produtos.entrySet()) {

			System.out.println("Produto: " + p.getKey() + " Quantidade: " + p.getValue());
		}
		
		totalQuantidade = produtos.values().stream().mapToInt(Integer::intValue).sum();
		System.out.println("Quantidade Total:" + totalQuantidade);
	}
}