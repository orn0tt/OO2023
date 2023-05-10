package exemplos;

public class Lutador {

	private String nome;
	private Categoria categoria;
	private int idade;
	private double peso;

	public Lutador(String nome, Categoria categoria, int idade, double peso) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.idade = idade;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Lutador [nome=" + nome + ", categoria=" + categoria + ", idade=" + idade + ", peso=" + peso + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}