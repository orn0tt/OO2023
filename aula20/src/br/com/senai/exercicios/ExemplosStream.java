package br.com.senai.exercicios;

import java.util.Arrays;
import java.util.List;

public class ExemplosStream {

	public static void main(String[] args) {

		List<Double> numeros = Arrays.asList(100., 90., 10.5, 92.5, 15., 34.5, 48.2, 19.3);

		// numeros.stream().limit(3).skip(1).forEach(n -> System.out.println(n));
		numeros.stream().sorted().forEach(n -> System.out.println(n));

		System.out.println("--------------");

		List<Integer> listaInteiros = Arrays.asList(100, 200, 20, 40, 990, 110, 94, 230);

		listaInteiros.stream().map(n -> n * 2).forEach(n -> System.out.println(n));

	}
}