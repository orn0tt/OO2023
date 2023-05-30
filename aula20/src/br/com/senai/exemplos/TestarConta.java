package br.com.senai.exemplos;

public class TestarConta {

	public static void main(String[] args) {

		Conta conta = () -> System.out.println("Transação efetuada com sucesso!");
		conta.transacao();

		Conta conta2 = () -> System.out.println("teste");
		conta2.transacao();
	}
}