package br.com.senai.heranca;

public class PessoaJuridica extends ImpostoDeRenda {

	private String cnpj;

	public PessoaJuridica(String nome, String email, double rendimentos, String cnpj) {
		super(nome, email, rendimentos);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double imposto() {
		return rendimentos * 0.20;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + cnpj;
	}
}