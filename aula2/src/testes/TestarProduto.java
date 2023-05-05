package testes;

import objetos.Produto;

public class TestarProduto {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		
		System.out.println(p1==p2?"Igual":"Diferente");
	}

}
