package br.com.senai.exemplos;

public abstract class Auxiliar extends Funcionario {

	private String categoria;

	public Auxiliar(String nome, String cpf, String turno, double salario, String categoria) {
		super(nome, cpf, turno, salario);
		this.categoria = categoria;
	}

}