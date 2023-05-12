package exercicios;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestarLista2 {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Amaral", "23343", 30);
		Pessoa p2 = new Pessoa("Joaquim", "1343", 50);
		Pessoa p3 = new Pessoa("Rogério", "3343", 60);
		
		//Cliente c1 = new Cliente("Antônio");
		
		List<Pessoa> pessoas = Arrays.asList(p1,p2,p3);
		//List<Cliente> clientes = Arrays.asList(c1);
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
		System.out.println("----------------");
		//for (Cliente cliente : clientes) {
		//	System.out.println(cliente);
		//}
	}
}