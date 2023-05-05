package br.com.senai.heranca;

public class Moto extends Veiculo {

	private int cilindradas;

	public Moto(String placa, String chassi, String cor, double valor, int cilindradas) {
		super(placa, chassi, cor, valor);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public double valorIPVA() {
		return valor * 0.02;
	}
}