package br.com.senai.exercicios;

public class Pessoa implements Comparable<Pessoa> {

	private String nome;
	private String cpf;
	private Integer idade;

	public Pessoa(String nome, String cpf, Integer idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int compareTo(Pessoa p) {
		return -idade.compareTo(p.getIdade());
	}
}