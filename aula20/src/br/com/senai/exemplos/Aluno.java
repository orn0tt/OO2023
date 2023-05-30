package br.com.senai.exemplos;

public class Aluno {

	private String nome, email;
	private Integer pontuacao;

	public Aluno(String nome, String email, Integer pontuacao) {
		super();
		this.nome = nome;
		this.email = email;
		this.pontuacao = pontuacao;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", email=" + email + ", pontuacao=" + pontuacao + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}
}