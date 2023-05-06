package exemplos;

public class ControlePagamento {

	private double totalPagoPlano;

	public double getTotalPagoPlano() {
		return totalPagoPlano;
	}
	
	@Override
	public String toString() {
		return String.format("%.2f", totalPagoPlano);
	}
	
	public void calcularTotalPlano(Plano p) {
		totalPagoPlano = totalPagoPlano + p.getValorPago();
	}
}