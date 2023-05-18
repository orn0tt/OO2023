package exercicios;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class TestarProduto {

	public static void main(String[] args) {

		String descricao;
		double preco, valorReajuste;
		int confirmacao = 0;
		List<Produto> produtos = new ArrayList<>();
		Produto produto;

		do {

			try {

				descricao = JOptionPane.showInputDialog("Descrição: ");

				preco = Double.parseDouble(JOptionPane.showInputDialog("Preço: "));

				produto = new Produto(descricao, preco);

				produtos.add(produto);

				confirmacao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação",
						JOptionPane.YES_OPTION);

			} catch (NumberFormatException e) {
				
				JOptionPane.showMessageDialog(null, "Você digitou caracteres no preço." , "Erro", 0);
			}

		} while (confirmacao == 0);

		valorReajuste = Double.parseDouble(JOptionPane.showInputDialog("Percentual reajuste: "));

		for (Produto p : produtos) {
			p.reajustarPreco(valorReajuste);
			JOptionPane.showMessageDialog(null, "Produto atualizado - " + p, "Atualizar", 1);
		}

		JOptionPane.showMessageDialog(null, "Total de produtos: " + produtos.size(), "Total", 1);
	}
}