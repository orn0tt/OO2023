package exercicios;

import java.util.ArrayList;
import java.util.List;

public class TestarLista {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Amaral", "23343", 30);
		Pessoa p2 = new Pessoa("Joaquim", "1343", 50);
		Pessoa p3 = new Pessoa("Rogério", "3343", 60);
		
		//Cliente c1 = new Cliente("Antônio");
		
		List lista = new ArrayList<>();
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		//lista.add(c1);
		
		for (int i = 0; i < lista.size(); i++) {
			
			if (lista.get(i) instanceof Pessoa) {
				Pessoa p = (Pessoa)lista.get(i);
				System.out.println(p.getNome());
			} //else {
			//	Cliente c = (Cliente) lista.get(i);
				//System.out.println(c.getNome());
			//}
			
		}
	}
}