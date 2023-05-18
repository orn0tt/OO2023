package exceptions;

public class TesteExceptionNull {

	public static void main(String[] args) {

		String texto1 = null;
		String texto2 = null;

		try {
			
			String saida = texto1.toUpperCase();

			System.out.println(saida);

		} catch (NullPointerException e) {

			System.out.println("A String foi iniciado com null.");

			e.printStackTrace();
			
		}
	}
}