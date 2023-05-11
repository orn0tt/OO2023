package exercicio1;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina {

	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;

	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "Nome proprietário: " + proprietario.getNome() + " Modelo: " + modelo + " Valor cobrado: " + valorCobrado;
	}

	public double getValorCobrado() {
		return valorCobrado;
	}

	@Override
	public abstract double lavarVeiculo();

	@Override
	public abstract double trocarOleo();

	@Override
	public abstract double revisao();
}