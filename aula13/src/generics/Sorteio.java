package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteio<T> {

	private List<T> lista;
	private Random random;

	public Sorteio() {

		lista = new ArrayList<>();
		random = new Random();
	}

	public void adicionar(T elemento) {

		lista.add(elemento);
	}

	public void remover(T elemento) {

		lista.remove(elemento);
	}

	public T realizarSorteio() {

		int pos = random.nextInt(lista.size());
		return lista.get(pos);
	}
}
