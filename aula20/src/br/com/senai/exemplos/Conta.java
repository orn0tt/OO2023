package br.com.senai.exemplos;

@FunctionalInterface
public interface Conta {

	public void transacao();

	public default void investimento() {
		System.out.println("Transação efetuada com sucesso!");
	}
}