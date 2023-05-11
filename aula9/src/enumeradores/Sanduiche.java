package enumeradores;

public enum Sanduiche {

	HOTDOG("Cachorro Quente", 7), HAMBURGUER("Hamburguer Tradicional", 14), MISTO("Misto Quente", 6);

	private final String tipoSanduiche;
	private final double valor;

	private Sanduiche(String tipoSanduiche, double valor) {
		this.tipoSanduiche = tipoSanduiche;
		this.valor = valor;
	}

	public String getTipoSanduiche() {
		return tipoSanduiche;
	}

	public double getValor() {
		return valor;
	}
}