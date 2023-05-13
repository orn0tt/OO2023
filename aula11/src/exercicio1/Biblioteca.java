package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private String responsavel;
	private static List<Livro> listaLivros = new ArrayList<>();

	public Biblioteca(String responsavel) {
		super();
		this.responsavel = responsavel;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public List<Livro> getListaLivros() {
		return listaLivros;
	}

	public void adicionar(Livro livro) {
		getListaLivros().add(livro);
	}

	public void listar() {
		for (Livro l : listaLivros) {
			System.out.println(l);
		}
	}

	public int pesquisarFaixaDePreco(double valorInicial, double valorFinal) {

		int contador = 0;

		for (Livro l : listaLivros) {
			if (l.getPreco() >= valorInicial && l.getPreco() <= valorFinal) {
				System.out.println(l);
				contador++;
			}
		}
		return contador;
	}

	public double calcularTotalLivros() {

		double total = 0;

		for (Livro l : listaLivros) {
			total += l.getPreco();
		}

		return total;
	}

	public void menu() {
		System.out.println("*******BIBLIOTECA DA FACULDADE*******");
		System.out.println("1- Adicionar");
		System.out.println("2- Listar");
		System.out.println("3- Pesquisar Por Preço");
		System.out.println("4- Calcular Total");
		System.out.println("5- Sair");
		System.out.println("Digite a opção: ");
	}
}