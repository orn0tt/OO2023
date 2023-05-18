package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import exercicios.Produto;

public class Exemplo1Generics {

	public static void main(String[] args) {

		List<Produto> produtos = new ArrayList<>();

		List<String> cores = Arrays.asList("Branco", "Azul");

		MeuGenerico<Integer> a = new MeuGenerico<Integer>(10);
		System.out.println(a.getVar());

		MeuGenerico<String> b = new MeuGenerico<String>("Celular");
		System.out.println(b.getVar());

		MeuGenerico<Produto> produto1 = new MeuGenerico<>(new Produto("TV", 2000));
		System.out.println(produto1);

		MeuGenerico<Double> d = new MeuGenerico<Double>(10.5);

	}
}