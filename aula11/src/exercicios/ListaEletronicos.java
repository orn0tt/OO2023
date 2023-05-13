package exercicios;

import java.util.Set;
import java.util.TreeSet;

public class ListaEletronicos {

	public static void main(String[] args) {

		// Criando e adicionando coisas à lista:

		// ArrayList, aceita elementos duplicados e pode adicionar e excluir a vontade
		// List<String> eletronicos = new ArrayList<>();

		// HashSet, não aceita duplicados mas não mantém a ordem de entrada
		// Set<String> eletronicos = new HashSet<>();

		// LinkedHashSet, não aceita duplicados mas mantém a ordem de entrada
		// Set<String> eletronicos = new LinkedHashSet<>();

		// TreeSet, não aceita duplicados e ordena por ordem alfabética
		Set<String> eletronicos = new TreeSet<>();

		eletronicos.add("Celular");
		eletronicos.add("TV 42");
		eletronicos.add("Radio");
		eletronicos.add("Radio");
		eletronicos.add("Relógio");

		// Varrer a lista
		for (String e : eletronicos) {
			System.out.println(e);
		}

		// Ternário
		System.out.println(eletronicos.contains("Celular") ? "Existe" : "Não existe");
	}
}