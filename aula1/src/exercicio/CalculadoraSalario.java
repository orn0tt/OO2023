
package exercicio;

public class CalculadoraSalario {

	public static void main(String[] args) {
		float salario = 1500f;
		String nome;
		nome = "Gabriel";

		if (salario <= 1751.81) {
			salario = (salario - (salario * 0.08f));
		}

		if (salario >= 1751.82 & salario <= 2919.72) {
			salario = (salario - (salario * 0.09f));
		}

		if (salario >= 2919.73 & salario <= 5839.45) {
			salario = (salario - (salario * 0.1f));
		}

		if (salario > 5839.456) {
			salario = (salario - (salario * 0.11f));
		}

		System.out.println("O salário de " + nome + " será:" + salario);
	}
}
