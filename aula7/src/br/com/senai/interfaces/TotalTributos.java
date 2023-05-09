package br.com.senai.interfaces;

public class TotalTributos {

	private double total;

	public double getTotal() {
		return total;
	}

	public void totalizarTributos(Tributos t) {
		total = total + t.calcularICMS();
		total = total + t.calcularImpostoDeRenda();
		
		System.out.println(t + "\n"+ "ICMS " + t.calcularICMS());
		System.out.println("IR "+ t.calcularImpostoDeRenda()+"\n");
	}
}