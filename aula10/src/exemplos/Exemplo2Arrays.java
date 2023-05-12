package exemplos;

import java.util.Arrays;
import java.util.List;

public class Exemplo2Arrays {

	public static void main(String[] args) {

		String[] carros = { "Fusca", "Gol", "Corsa", "HB20" };
		List listaCarros = Arrays.asList(carros);

		carros[0] = "Sandero";

		System.out.println(listaCarros);
		
		listaCarros.set(3, "KWID");
		
		System.out.println(carros[3]);
		
		System.out.println("------------------");
		String[] cores = {"Azul","Branco","Preto"};
		List listaCores = List.of(cores);
		cores[0] = "Amarelo";
		
		System.out.println(listaCores);
		
	}
}