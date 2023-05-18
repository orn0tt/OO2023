package exceptions;

public class Calculo {

	public static int divisão(int num1, int num2) throws ArithmeticException {
		
		/* exemplo com throw
		if (num2 == 0) {
			throw new ArithmeticException("Erro ! Você dividiu um nº por zero");
		}
		*/
		return num1 / num2;
	}
}