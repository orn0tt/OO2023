package repeticao;

public class ExercicioNumero {

	public static void main(String[] args) {

		int contPar = 0, contImpar = 0;

		for (int i = 0; i <= 30; i++) {
			if (i % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}
		}
		System.out.println("Pares: " + contPar);
		System.out.println("Impares: " + contImpar);
	}
}