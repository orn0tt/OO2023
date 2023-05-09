package br.com.senai.interfaces;

public class ContaCorrente implements Conta{

	private String titular;
	private double saldo, taxa;

	public ContaCorrente(String titular, double saldo, double taxa) {
		super();
		this.titular = titular;
		this.saldo = saldo;
		this.taxa = taxa;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	@Override
	public void sacar(double valor) {
		
		if (saldo > valor) {
			saldo = saldo - valor - taxa;
		}
	}

	@Override
	public void deposito(double valor) {
		
		saldo = saldo + valor;
	}
}