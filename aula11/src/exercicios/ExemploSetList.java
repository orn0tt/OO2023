package exercicios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExemploSetList {

	public static void main(String[] args) {

		List<Integer> a = Arrays.asList(30, 50, 100, 90);
		List<Integer> b = Arrays.asList(20, 30, 50, 60);

		// União
		// Set<Integer> c = new HashSet<>(a);
		// c.addAll(b);

		// for (Integer i : c) {
		// System.out.println(i);
		// }

		// Interseção
		// Set<Integer> d = new HashSet<>(a);
		// d.retainAll(b);
		// for (Integer i : d) {
		// System.out.println(i);
		// }

		// Diferença
		Set<Integer> e = new HashSet<>(a);
		e.removeAll(b);

		for (Integer i : e) {
			System.out.println(i);
		}
	}
}