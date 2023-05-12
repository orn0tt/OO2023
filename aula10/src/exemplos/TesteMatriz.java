package exemplos;

public class TesteMatriz {

	public static void main(String[] args) {

		String[][] cliente = { { "Marcos", "2234-1909" }, { "Carla", "2232-1209" }, { "Carlos", "2231-1109" } };

		for (int l = 0; l < cliente.length; l++) {

			System.out.println("-----------");
			for (int c = 0; c < cliente[c].length; c++) {

				System.out.println(cliente[l][c]);
			}
		}
	}
}