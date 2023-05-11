package exercicio1;

import java.time.LocalDate;

public class Carro extends Veiculo {

	private String categoria;

	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return super.toString() + " Categoria carro: " + categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public double lavarVeiculo() {

		return valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
	}

	@Override
	public double trocarOleo() {

		if (dataConserto.getDayOfWeek().getValue() == 6) {
			return valorCobrado += TipoServico.OLEO.getValorPorServico() - 50;
		}
		return valorCobrado += TipoServico.OLEO.getValorPorServico();
	}

	@Override
	public double revisao() {

		if (dataConserto.getMonth().getValue() == 8) {
			return valorCobrado += TipoServico.REVISAO.getValorPorServico()
					- ((TipoServico.REVISAO.getValorPorServico() * 10) / 100);
		}
		return valorCobrado += TipoServico.REVISAO.getValorPorServico();
	}
}