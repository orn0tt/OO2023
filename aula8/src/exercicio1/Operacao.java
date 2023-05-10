package exercicio1;

public class Operacao implements Livraria {

	private String tipo;
	private double valorOperacao;
	private Livro livro;

	public Operacao(String tipo, Livro livro) {
		super();
		this.tipo = tipo;
		this.livro = livro;
	}

	@Override
	public String toString() {
		return "Tipo: " + tipo + " Valor: " + String.format("%.3f", valorOperacao) + " Autor: " + livro.getAutor() + " Título: "
				+ livro.getTitulo();
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public String getTipo() {
		return tipo;
	}

	public double getValorOperacao() {
		return valorOperacao;
	}

	@Override
	public void emprestarLivro() {
		valorOperacao = (livro.getValor() * 0.02) + taxaEmprestimo;
	}

	@Override
	public void venderLivro() {
		valorOperacao = livro.getValor() + (livro.getValor() * 0.09);
	}
}