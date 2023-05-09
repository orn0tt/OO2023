package br.com.senai.exemplos;

public class Gerente extends Funcionario {

	private String nivel;

	public Gerente(String nome, String cpf, String turno, double salario, String nivel) {
		super(nome, cpf, turno, salario);
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return super.toString() + "nivel: " + nivel;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	@Override
	public void reajusteSalarial() {

		salario = salario * 1.12 + 100;
	}

}