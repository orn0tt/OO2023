package br.com.senai.exercicios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("Adriano", 32, "a@gmail.com");
		Cliente c2 = new Cliente("Adriano", 33, "a@gmail.com");
		Cliente c3 = new Cliente("Adriano", 32, "a@gmail.com");
		Cliente c4 = new Cliente("Adriano", 33, "a@gmail.com");

		Set<Cliente> clientes = new HashSet<>();

		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		clientes.add(c4);

		System.out.println(clientes);

		List<String> cores = Arrays.asList("Branco", "Laranja", "Branco");
		Set<String> coresSet = new HashSet<>(cores);
		System.out.println(coresSet);
	}
}