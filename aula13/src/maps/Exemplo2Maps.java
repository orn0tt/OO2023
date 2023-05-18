package maps;

import java.util.Map;
import java.util.TreeMap;

public class Exemplo2Maps {

	public static void main(String[] args) {

		TreeMap<Integer, String> nomes = new TreeMap<>();

		nomes.put(20, "Ana");
		nomes.put(40, "José");
		nomes.put(35, "Carlos");
		nomes.put(38, "Sérgio");
		nomes.put(12, "Maria");

		// System.out.println(nomes);

		nomes.replace(1, "Ana Carolina");
		// nomes.remove(3);

		// System.out.println(nomes.get(1));

		for (Map.Entry<Integer, String> mapa : nomes.entrySet()) {
			System.out.println(mapa.getKey() + "-" + mapa.getValue());
		}

		System.out.println(nomes.descendingKeySet());
		System.out.println(nomes.descendingMap());
	}
}