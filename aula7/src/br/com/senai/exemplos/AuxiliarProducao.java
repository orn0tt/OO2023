package br.com.senai.exemplos;

public class AuxiliarProducao extends Auxiliar{

	private String numeroMaquina;

	public AuxiliarProducao(String nome, String cpf, String turno, double salario, String categoria,
			String numeroMaquina) {
		super(nome, cpf, turno, salario, categoria);
		this.numeroMaquina = numeroMaquina;
	}

	@Override
	public void reajusteSalarial() {
		
	}
}