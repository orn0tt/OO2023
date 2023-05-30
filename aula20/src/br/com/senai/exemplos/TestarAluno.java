package br.com.senai.exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import javax.swing.JOptionPane;

public class TestarAluno {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<>();

		Aluno a1 = new Aluno("aaa", "aaa@gmail.com", 90);
		Aluno a2 = new Aluno("bbb", "bbb@gmail.com", 40);
		Aluno a3 = new Aluno("ccc", "ccc@gmail.com", 60);

		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);

		// Forma tradicional
		/*
		 * for (Aluno a : alunos) { System.out.println(a); }
		 * 
		 * ExibirDados ed = new ExibirDados(); alunos.forEach(ed);
		 */

		// Forma mais convencional
		/*
		 * Consumer<Aluno> c = new Consumer<Aluno>() {
		 * 
		 * @Override public void accept(Aluno aluno) {
		 * 
		 * System.out.println(aluno); } }; alunos.forEach(c);
		 */

		// Expressão LAMBDA
		// alunos.forEach((aluno) -> JOptionPane.showMessageDialog(null, aluno));

		// Expressão METHOD REFERENCE
		alunos.forEach(System.out::println);
	}
}