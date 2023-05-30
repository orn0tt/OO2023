package br.com.senai.exercicios;

import java.util.Arrays;
import java.util.List;

public class TestarFuncionario {

	public static void main(String[] args) {

		List<Funcionario> funcionarios = Arrays.asList(new Funcionario("Ana", "ADM", 5000.),
				new Funcionario("Carla", "RH", 3000.), new Funcionario("Igor", "ADM", 2900.),
				new Funcionario("Carlos", "CPD", 3100.), new Funcionario("César", "Compras", 1900.));

		Boolean resultado = funcionarios.stream().anyMatch(f -> f.getSetor().equals("ADM"));

		System.out.println(resultado);

		funcionarios.stream().filter(f -> f.getSetor().equals("ADM")).forEach(f -> System.out.println(f));
	}
}