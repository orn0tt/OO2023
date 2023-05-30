package br.com.senai.exercicios;

import java.util.Arrays;
import java.util.List;

public class TestarString {

	public static void main(String[] args) {

		List<String> linguagens = Arrays.asList("Java", "PHP", "JavaScript", "Delphi", "Dart");

		// linguagens.forEach(l -> System.out.println(l));
		linguagens.forEach(System.out::println);
	}
}