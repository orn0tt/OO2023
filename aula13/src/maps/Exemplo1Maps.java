package maps;

import java.util.HashMap;
import java.util.Map;

public class Exemplo1Maps {

	public static void main(String[] args) {

		HashMap<String, String> estados = new HashMap<>();

		estados.put("AC", "ACRE");
		estados.put("MG", "MINAS GERAIS");
		estados.put("RJ", "RIO DE JANEIRO");
		estados.put("SP", "SÃO PAULO");

		System.out.println(estados.keySet());

		System.out.println("---IMPRIMIR CHAVES---");
		
		for (String c : estados.keySet()) {
			System.out.println(c);
		}
		
		System.out.println("---IMPRIMIR VALORES---");
		
		for (String s : estados.values()) {
			System.out.println(s);
		}
		
		System.out.println("---IMPRIMIR CHAVES E VALORES---");
		
		for (Map.Entry<String, String> mapa : estados.entrySet()) {
			System.out.println(mapa.getKey() + "-" + mapa.getValue());
		}
	}
}