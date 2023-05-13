package exercicio1;

public class Livro {

	private String titulo;
	private String autor;
	private double preco;

	public Livro(String titulo, String autor, double preco) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Título: " + titulo + " Autor: " + autor + " Preço: R$" + preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public double getPreco() {
		return preco;
	}
}