package br.com.senai.exemplos;

public class Assistente extends Funcionario {

	private double adicional;

	public Assistente(String nome, String cpf, String turno, double salario, double adicional) {
		super(nome, cpf, turno, salario);
		this.adicional = adicional;
	}
	
	@Override
	public String toString() {
		return super.toString() + "adicional: " + adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	@Override
	public void reajusteSalarial() {

		salario = salario * 1.10;
	}
}