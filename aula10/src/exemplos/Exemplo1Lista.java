package exemplos;

import java.util.ArrayList;
import java.util.List;

public class Exemplo1Lista {

	public static void main(String[] args) {

		List<String> times = new ArrayList<>();

		times.add("Flamengo");
		times.add("Fluminense");
		times.add("Botafogo");
		times.add("Bangu");

		times.remove(0);

		System.out.println(times);

		for (Object o : times) {
			System.out.println(o);
		}

		System.out.println("Total de times: " + times.size());
		System.out.println(times.get(2));
		
		times.set(2, "Vasco");
		System.out.println(times.get(2));
		
		if (times.isEmpty()) {
			System.out.println("Lista Vazia");
		} else {
			System.out.println("Lista Preenchida");
		}
		
		if (times.contains("Fluminense")) {
			System.out.println("Fluminense está na lista");
		} else {
			System.out.println("Não está na lista");
		}
	}
}