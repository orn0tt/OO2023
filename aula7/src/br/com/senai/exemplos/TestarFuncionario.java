package br.com.senai.exemplos;

public class TestarFuncionario {

	public static void main(String[] args) {

		Assistente a = new Assistente("Ana", "234", "Integral", 3000, 100);
		Diretor d = new Diretor("Juliana", "2345", "Integral", 10000, "Financeiro");

		a.reajusteSalarial();
		d.reajusteSalarial();

		System.out.println(a);
		System.out.println(d);
	}
}