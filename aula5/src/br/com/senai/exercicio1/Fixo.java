package br.com.senai.exercicio1;

public class Fixo extends Vendedor {

	private double salarioBase, comissao, salarioBruto=2000;
	static double totalVenda;

	public Fixo(String nome, String cpf, double salarioBase, double comissao) {
		super(nome, cpf);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public void calcularSalario(double valorVenda) {
		this.totalVenda+=valorVenda;
		salarioBruto = (valorVenda * comissao + salarioBase) / 100;
	}
}