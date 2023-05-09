package br.com.senai.interfaces;

public class Pessoa implements Tributos {

	private String nome;
	private double rendimentos;
	
	public Pessoa(String nome, double rendimentos) {
		super();
		this.nome = nome;
		this.rendimentos = rendimentos;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", rendimentos=" + rendimentos + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}

	@Override
	public double calcularImpostoDeRenda() {
		return rendimentos * valorImpostoPF;
	}

	@Override
	public double calcularICMS() {
		return 0;
	}
}