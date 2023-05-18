package exercicios;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TestarAluno {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		char resp = 'S';

		List<Aluno> alunos = new ArrayList<>();

		Aluno aluno;

		do {
			
			try {
				System.out.println("Digite o nome do aluno: ");
				String nome = sc2.nextLine();

				System.out.println("Digite a primeira nota: ");
				double nota1 = sc2.nextDouble();

				System.out.println("Digite a segunda nota: ");
				double nota2 = sc2.nextDouble();

				aluno = new Aluno(nome, nota1, nota2);

				alunos.add(aluno);

				System.out.println("Digite (S/s) para continuar");
				resp = sc1.next().charAt(0);
				
			} catch (AlunoException e) {
				System.err.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.err.println("Você digitou um caracter inválido.");
			}
			
		} while (resp == 'S' || resp == 's');

	}
}