package exercicio1;

import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {

		Proprietario proprietario1 = new Proprietario("Gabriel");
		Carro carro1 = new Carro("Skyline R34", LocalDate.of(2023, 8, 5), proprietario1, "GT-R");

		carro1.trocarOleo();
		carro1.revisao();
		
		System.out.println(carro1);
	}
}