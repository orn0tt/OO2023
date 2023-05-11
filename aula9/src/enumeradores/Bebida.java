package enumeradores;

public enum Bebida {

	REFRIGERANTE("Refrigerante", 6.2), SUCO("Suco de Laranja", 7), AGUA("Água Mineral", 2);

	private final String tipoBebida;
	private final double valor;

	private Bebida(String tipoBebida, double valor) {
		this.tipoBebida = tipoBebida;
		this.valor = valor;
	}

	public String getTipoBebida() {
		return tipoBebida;
	}

	public double getValor() {
		return valor;
	}
}