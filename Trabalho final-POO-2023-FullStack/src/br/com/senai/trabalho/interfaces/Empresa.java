package br.com.senai.trabalho.interfaces;

public interface Empresa {
	String listaFuncionarios();
	void listaDependentes();
	
	Double calculoINSS();
	Double calculoIR();
}
