package aula2exercicios;

import java.util.Scanner;

public class TestarPessoa {

	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		Pessoa[] pessoa = new Pessoa[4];

		String maior_peso = "zé";
		String maior_altura = "zé";
		double mp = 0;
		double ma = 0;

		for (int i = 0; i < 4; i++) {

			pessoa[i] = new Pessoa();

			System.out.println("Nome:");
			pessoa[i].nome = ler.next();
			System.out.println("Peso:");
			pessoa[i].peso = ler.nextDouble();
			System.out.println("Altura");
			pessoa[i].altura = ler.nextDouble();

			if (pessoa[i].peso > mp) {
				maior_peso = pessoa[i].nome;
				mp = pessoa[i].peso;
			}

			if (pessoa[i].altura > ma) {
				maior_altura = pessoa[i].nome;
				ma = pessoa[i].altura;
			}
		}
		System.out.printf("%s tem o maior peso.\n", maior_peso);
		System.out.printf("%s tem a maior altura.\n", maior_altura);
		System.out.printf("A média dos pesos é %.2f \n",
				pessoa[0].peso + pessoa[1].peso + pessoa[2].peso + pessoa[3].peso / 4);
		System.out.printf("A média das alturas é %.2f",
				pessoa[0].altura + pessoa[1].altura + pessoa[2].altura + pessoa[3].altura / 4);
	}
}
