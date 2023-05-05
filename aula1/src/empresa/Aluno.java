package empresa;

public class Aluno {

	public static void main(String[] args) {

		double nota1 = 0, nota2 = 7, nota3 = 8, nota4 = 6, media;

		int avaliacaoCurso = 1;

		String situacao;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("A média é:" + media);

		if (media > 7) {
			System.out.println("Aluno Aprovado!");
		} else {
			System.out.println("Aluno Reprovado!");
		}

		// Ternário
		situacao = (media >= 7 ? "Aprovado" : "Reprovado");
		System.out.println("A situação do aluno é: " + situacao);

		switch (avaliacaoCurso) {
		case 5:
			System.out.println("Excelente");
			break;

		case 4:
			System.out.println("Bom");
			break;

		case 3:
			System.out.println("Regular");
			break;

		case 2:
			System.out.println("Ruim");
			break;

		case 1:
			System.out.println("Péssimo");
			break;

		default:
			System.out.println("Não respondeu");
			break;
		}
	}
}
