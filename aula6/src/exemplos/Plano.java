package exemplos;

public class Plano {

	protected String empresa;
	protected double valorPago = 80, valorISS = 5;

	// Construtor somente para nome da empresa
	public Plano(String empresa) {
		super();
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return empresa + " " + String.format("%.2f", valorPago);
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public double getValorISS() {
		return valorISS;
	}

	public void setValorISS(double valorISS) {
		this.valorISS = valorISS;
	}

	public double calcularPagamento() {
		return valorPago = valorPago - valorPago * valorISS / 100;
	}
}