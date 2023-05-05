package br.com.senai.exercicios;

public class Medico {
	
	//Atributos
	private String crm, nome;
	private double salario, valorConsulta;

	
	//Construtores
	public Medico(String crm, String nome, double salario, double valorConsulta) {
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valorConsulta = valorConsulta;
	}

	
	//Getters e Setters
	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}
	
	
	//Método
	public void pagamentoEmDinheiro(double valor) {
		salario += valor;
	}

	public void pagamentoPlano(double valor) {
		salario += valor * 0.70;
	}
}
