package maps;

import java.util.HashMap;
import java.util.Map;

public class Exemplo3Maps {

	public static void main(String[] args) {

		HashMap<String, String> carros = new HashMap<>();

		carros.put("VW", "GOL");
		carros.put("BMW", "IX3");
		carros.put("AUDI", "A4");
		carros.put("VW", "GOLF");

		System.out.println("---CHAVES---");
		// Printar as keys
		for (String c : carros.keySet()) {
			System.out.println(c);
		}

		System.out.println("---CHAVES E VALORES---");
		// Printar as keys + values
		for (Map.Entry<String, String> c : carros.entrySet()) {
			System.out.println(c.getKey() + "-" + c.getValue());
		}
	}
}