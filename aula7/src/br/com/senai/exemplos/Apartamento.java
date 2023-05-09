package br.com.senai.exemplos;

public class Apartamento extends Imovel {

	private int andar;

	public Apartamento(String local, double valor, int andar) {
		super(local, valor);
		this.andar = andar;
	}

	@Override
	public String toString() {
		return super.toString() + "andar: " + andar;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}
}