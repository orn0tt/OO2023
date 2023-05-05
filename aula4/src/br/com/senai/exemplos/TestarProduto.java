package br.com.senai.exemplos;

import javax.swing.JOptionPane;

public class TestarProduto {

	public static void main(String[] args) {

		Produto produto = new Produto();
		
		// *Método menos eficaz:
		
		// int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código do produto: "));
		// String descricao = JOptionPane.showInputDialog("Descrição do produto: ");
		// double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do produto: "));
		// double valorReajuste = Double.parseDouble(JOptionPane.showInputDialog("Valor reajuste: "));
		
		
		// *Método mais eficaz:
		
		produto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código do produto: ")));
		produto.setDescricao(JOptionPane.showInputDialog("Descrição do produto: "));
		produto.setValor(Double.parseDouble(JOptionPane.showInputDialog("Valor do produto: ")));
		produto.atualizarValor(Double.parseDouble(JOptionPane.showInputDialog("Valor reajuste: ")));

		JOptionPane.showMessageDialog(null, produto.getDescricao() + "\n" + produto.getValor());
	}

}
