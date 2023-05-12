package exercicios;

import java.util.HashSet;
import java.util.Set;

public class TesteSetJava {

	public static void main(String[] args) {
		
		Set<String> times = new HashSet<>();
		times.add("Flamengo");
		times.add("Flamengo");
		times.add("Flamengo");
		times.add("Vasco");
		times.add("Botafogo");
		times.add("Fluminense");
		
		for (String s : times) {
			System.out.println(s);
		}
	}
}