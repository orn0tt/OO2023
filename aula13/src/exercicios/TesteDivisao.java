package exercicios;

public class TesteDivisao {

	public static void main(String[] args) {

		try {
			System.out.println(Operacao.dividir(20, 0));
		} catch (ArithmeticException e) {
			System.out.println("Você digitou zero no denominador.");
		}
	}
}