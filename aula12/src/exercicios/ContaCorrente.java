package exercicios;

public class ContaCorrente implements Conta {

	private String titular;
	private String numero;
	private double saldo;

	public ContaCorrente(String titular, String numero, double saldo) {
		super();
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaCorrente [titular=" + titular + ", numero=" + numero + ", saldo=" + saldo + "]";
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public boolean saque(double valor) {

		if (saldo <= valor) {
			throw new ContaException("Valor insuficiente.");
		} else {
			saldo -= valor;
			return true;
		}
	}

	@Override
	public void deposito(double valor) {

		if (valor <= 0) {
			throw new ContaException("Você tentou depositar um valor igual ou menor que zero.");
		} else {
			saldo += valor;
		}
	}
}