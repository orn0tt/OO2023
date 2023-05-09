package br.com.senai.exemplos;

public class AssistenteAdministrativo extends Assistente {

	private String sala;

	public AssistenteAdministrativo(String nome, String cpf, String turno, double salario, double adicional,
			String sala) {
		super(nome, cpf, turno, salario, adicional);
		this.sala = sala;
	}

}