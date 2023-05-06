package exercicio1;

import java.util.Arrays;

public class Contato {

	private String nome;
	private Telefone[] telefone;
	private Endereco endereco;

	public Contato(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return nome + " " + Arrays.toString(telefone) + " " + endereco;
	}

	public Telefone[] getTelefones() {
		return telefone;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefone = telefones;
	}

	public String getNome() {
		return nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void mostrarTelefones() {

		for (int i = 0; i < telefone.length; i++) {
			System.out.println(telefone[i]);
		}
	}
}