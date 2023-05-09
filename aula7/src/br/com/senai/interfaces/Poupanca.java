package br.com.senai.interfaces;

public class Poupanca implements Conta {

	private String titular;
	private double saldo;

	public Poupanca(String titular, double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
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

	@Override
	public void sacar(double valor) {

		if (saldo >= valor) {
			saldo = saldo - valor;
		}
	}

	@Override
	public void deposito(double valor) {
		saldo += valor;
	}
}