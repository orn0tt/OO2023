package br.com.senai.exercicios;

public class TestarCalculo {

	public static void main(String[] args) {

		// Utilizando LAMBDA
		Calculo s = (a, b) -> a + b;
		System.out.println("O resultado da soma é: " + s.calcular(10, 20));

		// Utilizando METHOD REFERENCE
		Calculo calculo = Integer::sum;
		System.out.println("O resultado da soma é: " + calculo.calcular(10, 40));

		// Utilizando LAMBDA
		Calculo m = (a, b) -> a * b;
		System.out.println("O resultado da multiplicação é: " + m.calcular(10, 5));

		// Utilizando método oculto
		Calculo d = new Calculo() {

			@Override
			public int calcular(int a, int b) {
				return a / b;
			}
		};
		System.out.println("O resultado da divisão é: " + d.calcular(10, 5));
	}
}
