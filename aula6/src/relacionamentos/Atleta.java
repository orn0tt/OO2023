package relacionamentos;

public class Atleta {

	private String nome, posicao;
	private int idade;

	public Atleta(String nome, String posicao, int idade) {
		this.nome = nome;
		this.posicao = posicao;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Atleta [nome=" + nome + ", posicao=" + posicao + ", idade=" + idade + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}