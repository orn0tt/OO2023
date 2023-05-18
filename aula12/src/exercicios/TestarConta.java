package exercicios;

public class TestarConta {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente("Carlos", "123", 5000);

		// System.out.println("Depósito efetuado.");

		try {

			conta.deposito(0);

			conta.saque(200);

			System.out.println(conta);

		} catch (ContaException e) {

			System.out.println(e.getMessage() + " Deu erro.");

		}

		System.out.println("Fim de programa.");
	}
}