package objetos;

public class Conta {
	int numero;
	String titular;
	double saldo;

	// Comportamentos

	// VOID = o método não terá retorno
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito efetuado com sucesso!");
	}

	public boolean sacar(double valor) {

		if (saldo >= valor) {
			saldo -= valor;
			//System.out.println("Saque efetuado com sucesso!");
			return true;
		} else {
			//System.out.println("Saldo insuficiente.");
			return false;
		}
	}
}