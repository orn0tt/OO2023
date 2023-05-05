package br.com.senai.exemplos;

public class Fornecedor {

	private String cnpj, nome;
	private static int contador;

	/*
	 * public Fornecedor() {
	 * 
	 * }
	 */
	public Fornecedor(String cnpj, String nome) {
		this.cnpj = cnpj;
		this.nome = nome;
		contador++;
	}

	public static int getContador() {
		return contador;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}