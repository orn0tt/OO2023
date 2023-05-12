package exemplos;

public class ExemploVarArgs {

	public static void main(String[] args) {

		int total = calcularSoma(3, 10, 20, 30, 40);
		String nomes = concatenarNomes("José ", "da ", "Silva");

		System.out.println("Total: " + total);

		System.out.println(nomes);
	}

	private static String concatenarNomes(String... nomes) {

		String nome = "";
		for (String s : nomes) {
			nome = nome.concat(s);
		}
		return nome;
	}

	// VarArgs
	private static int calcularSoma(int a, int... numeros) {

		int soma = 0;

		for (int valor : numeros) {
			soma += valor;
		}

		return soma * a;
	}
}