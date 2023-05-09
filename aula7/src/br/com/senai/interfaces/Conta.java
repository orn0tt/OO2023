package br.com.senai.interfaces;

//Nenhuma interface tem implementação, somente assinaturas que deverão ser implementadas por quem
//implementar essa interface.
//Uma interface não pode ser instanciada.

public interface Conta {

	// public final static String nomeBanco="Bradesco";
	public void sacar(double valor);

	public void deposito(double valor);
}