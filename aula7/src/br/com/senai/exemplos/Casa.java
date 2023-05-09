package br.com.senai.exemplos;

public class Casa extends Imovel {

	private boolean garagem;

	//Construtor
	public Casa(String local, double valor, boolean garagem) {
		super(local, valor);
		this.garagem = garagem;
	}

	//Override no toString
	@Override
	public String toString() {
		/*
		 * if(garagem==true) { System.out.println("Tem garagem"); }else {
		 * System.out.println("Não tem garagem"); }
		 */
		return super.toString() + " " + (garagem ? "Tem garagem" : "Não tem garagem");
	}

	//Getters e Setters
	public boolean isGaragem() {
		return garagem;
	}

	public void setGaragem(boolean garagem) {
		this.garagem = garagem;
	}
}