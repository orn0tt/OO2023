package br.com.senai.heranca;

public class Caminhao extends Veiculo {

	private int cargaMaxima;

	public Caminhao(String placa, String chassi, String cor, double valor, int cargaMaxima) {
		super(placa, chassi, cor, valor);
		this.cargaMaxima = cargaMaxima;
	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	// Sobrescrita de método
	@Override
	public double valorIPVA() {
		return super.valorIPVA() + 500;
	}
}