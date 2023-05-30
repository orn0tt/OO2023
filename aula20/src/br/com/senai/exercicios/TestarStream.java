package br.com.senai.exercicios;

import java.util.ArrayList;
import java.util.List;

import br.com.senai.exemplos.Aluno;

public class TestarStream {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<>();

		Aluno a1 = new Aluno("aaa", "aaa@gmail.com", 90);
		Aluno a2 = new Aluno("bbb", "bbb@gmail.com", 40);
		Aluno a3 = new Aluno("ccc", "ccc@gmail.com", 60);

		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);

		System.out.println("----Lista Original----");
		alunos.forEach(System.out::println);

		System.out.println("----Lista Abreviada----");
		alunos.stream().map(a -> a.getNome().substring(0, 2)).forEach(a -> System.out.println(a));

		System.out.println("----Filtro----");
		alunos.stream().filter(a -> a.getPontuacao() > 80).forEach(a -> System.out.println(a));

		System.out.println("----Start----");
		alunos.stream().filter(a -> a.getNome().startsWith("c")).forEach(a -> System.out.println(a));
	}
}