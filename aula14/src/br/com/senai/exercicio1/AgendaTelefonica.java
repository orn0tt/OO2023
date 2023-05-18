package br.com.senai.exercicio1;

import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {

	private Map<String, String> colecao = new HashMap<>();

	public Map<String, String> getColecao() {
		return colecao;
	}

	public void setColecao(Map<String, String> colecao) {
		this.colecao = colecao;
	}

	public void inserir(String nome, String numero) {

		colecao.put(nome, numero);
	}

	public String buscar(String nome) {

		if (colecao.containsKey(nome) == true) {

			return "O nome existe na lista";
		}
		return "O nome " + nome + " não existe na lista";
	}

	public void remover(String nome) {

		colecao.remove(nome);
	}

	public int tamanho() {

		return colecao.size();
	}
}