package br.com.senai.exercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestarPessoa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Roni", "232", 47);
		Pessoa p2 = new Pessoa("Jaqueline", "132", 41);
		Pessoa p3 = new Pessoa("Ricardo", "242", 22);
		Pessoa p4 = new Pessoa("Gabriel", "3434", 19);

		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3, p4);

		Collections.sort(pessoas);

		System.out.println(pessoas);

		List<String> frutas = Arrays.asList("Manga", "Abacaxi", "Uva", "Kiwi");

		Collections.sort(frutas);

		System.out.println(frutas);

		List<Integer> numeros = Arrays.asList(10, 90, 50, 2, 15, 9);

		Collections.sort(numeros);

		System.out.println(numeros);
	}
}