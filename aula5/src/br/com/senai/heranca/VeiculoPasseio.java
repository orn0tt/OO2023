package br.com.senai.heranca;

public class VeiculoPasseio extends Veiculo {

	private String categoria;

	public VeiculoPasseio(String placa, String chassi, String cor, double valor, String categoria) {
		super(placa, chassi, cor, valor);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}