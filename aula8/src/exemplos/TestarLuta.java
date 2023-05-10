package exemplos;

import java.time.LocalDate;

public class TestarLuta {

	public static void main(String[] args) {

		Categoria c1 = new Categoria(1, "Peso médio");
		Categoria c2 = new Categoria(2, "Peso pena");

		Lutador l1 = new Lutador("Anderson Silva", c1, 40, 75);
		Lutador l2 = new Lutador("Vitor Belfort", c1, 45, 80);
		Lutador l3 = new Lutador("José Aldo", c2, 39, 60);

		Luta luta = new Luta(l1, l2, 10, LocalDate.of(2023, 5, 7));

		if (luta.confirmacaoLuta()) {

			luta.setConfirmado(true);
		} else {

			luta.setConfirmado(false);
		}

		System.out.println(luta);

		System.out.println(l1.equals(l2));
		System.out.println();
	}
}