package exercicios;

public abstract class Universidade {

	protected String nome;

	public Universidade(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Universidade [nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void fazerMatricula();
}