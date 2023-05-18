package exercicios;

public class Produto {

	private String descricao;
	private double preco;

	public Produto(String descricao, double preco) {
		super();
		this.descricao = descricao;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Descrição: " + descricao + " R$" + preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void reajustarPreco(double valor) {
		preco = preco + preco * valor / 100;
	}
}