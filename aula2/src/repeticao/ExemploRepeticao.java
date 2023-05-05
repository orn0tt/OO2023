package repeticao;

public class ExemploRepeticao {

	public static void main(String[] args) {

		int cont = 1;

		System.out.println("-----WHILE (ENQUANTO)-----");
		while (cont <= 10) {
			System.out.println(cont);
			cont++;
		}
		System.out.println("-----DO WHILE (FACA ENQUANTO)-----");
		cont = 1;
		do {
			System.out.println(cont);
			cont++;
		} while (cont <= 10);

		System.out.println("-----FOR (PARA)-----");

		for (int i = 1; i <= 10; i++) {
			if (i >= 5 && i <= 6) {
				continue;
			}
			System.out.println(i);
		}
	}
}
