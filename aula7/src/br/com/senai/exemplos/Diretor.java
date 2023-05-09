package br.com.senai.exemplos;

public class Diretor extends Funcionario {

	private String categoria;

	public Diretor(String nome, String cpf, String turno, double salario, String categoria) {
		super(nome, cpf, turno, salario);
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return super.toString() + "Categoria: " + categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public void reajusteSalarial() {

		salario = salario + 1000;
	}
}