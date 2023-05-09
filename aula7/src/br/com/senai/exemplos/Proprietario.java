package br.com.senai.exemplos;

public class Proprietario {

	private String nome;
	private Imovel imovel;

	public Proprietario(String nome, Imovel imovel) {
		super();
		this.nome = nome;
		this.imovel = imovel;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "Imóvel: " + imovel;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}
}