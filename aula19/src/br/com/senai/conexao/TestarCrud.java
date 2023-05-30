package br.com.senai.conexao;

import br.com.senai.dao.ProdutoDAO;
import br.com.senai.entity.Produto;

public class TestarCrud {

	public static void main(String[] args) {

		/*
		 * Inserir ProdutoDAO dao = new ProdutoDAO();
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Nome: "); String nome = sc.nextLine();
		 * 
		 * System.out.println("Descrição: "); String descricao = sc.nextLine();
		 * 
		 * System.out.println("Preço: "); Double preco = sc.nextDouble();
		 * 
		 * System.out.println("Quantidade: "); Integer quantidade = sc.nextInt();
		 * 
		 * Produto produto = new Produto(null, nome, descricao, preco, quantidade);
		 * 
		 * dao.inserir(produto);
		 */

		/* Listar */
		ProdutoDAO dao = new ProdutoDAO();

		for (Produto p : dao.listarPorNome("lu", 2)) {
			System.out.println(p);
		}
	}
}