package br.com.senai.exemplos;

public class ContaCorrente implements Conta {

	@Override
	public void transacao() {

		System.out.println("Transação efetuada com sucesso!");
	}
	
	@Override
	public void investimento() {
		
		System.out.println("Exemplo");
	}
}