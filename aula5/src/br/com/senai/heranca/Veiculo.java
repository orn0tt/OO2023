package br.com.senai.heranca;

public class Veiculo {

	protected String placa, chassi, cor;
	protected double valor;

	public Veiculo(String placa, String chassi, String cor, double valor) {
		super();
		this.placa = placa;
		this.chassi = chassi;
		this.cor = cor;
		this.valor = valor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double valorIPVA() {
		return valor * 0.04;
	}
}