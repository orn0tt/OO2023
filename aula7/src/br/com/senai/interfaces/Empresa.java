package br.com.senai.interfaces;

public class Empresa implements Tributos {

	private String razaoSocial;
	private double rendimentos;

	public Empresa(String razaoSocial, double rendimentos) {
		super();
		this.razaoSocial = razaoSocial;
		this.rendimentos = rendimentos;
	}

	@Override
	public String toString() {
		return "Empresa [razaoSocial=" + razaoSocial + ", rendimentos=" + rendimentos + "]";
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}

	@Override
	public double calcularImpostoDeRenda() {
		return rendimentos * valorImpostoPJ;
	}

	@Override
	public double calcularICMS() {
		return rendimentos * icms;
	}
}