package exercicio1;

public class Telefone {

	private String numero;

	public Telefone(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Telefone: " + numero;
	}

	public String getNumero() {
		return numero;
	}
}