package br.com.senai.interfaces;

import java.util.ArrayList;
import java.util.List;

public class TestarTributos {

	public static void main(String[] args) {

		Tributos p = new Pessoa("Ana", 25000);
		Tributos e = new Empresa("XPTO Ltda", 100000);
		TotalTributos tt = new TotalTributos();

		tt.totalizarTributos(p);
		tt.totalizarTributos(e);

		System.out.println("Total geral de tributos: " + tt.getTotal());
		
		List cores = new ArrayList<>();
		cores.add("Azul");
		cores.add("Branco");
		cores.add("Amarelo");
		System.out.println(cores);
	}
}