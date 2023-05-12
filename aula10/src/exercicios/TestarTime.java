package exercicios;

import java.util.Scanner;

public class TestarTime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Time time = new Time("Flamengo", "Sampaoli");
		
		
		
		Atleta atleta;
		int idade;
		String posicao;
		String nome;
		
		char resp = 'S';
		do {

			System.out.println("Nome: ");
			nome = sc.next();

			System.out.println("Idade:");
			idade = sc.nextInt();

			System.out.println("Posição: ");
			posicao = sc.next();

			atleta = new Atleta(nome, idade, posicao);
			time.adiconarAtleta(atleta);	

			System.out.println("Digite (S/s) para continuar");
			resp = sc.next().charAt(0);

		} while (resp == 'S' || resp == 's');
		
		System.out.println(time.getNome());
		time.imprimirAtletas();
	}
}