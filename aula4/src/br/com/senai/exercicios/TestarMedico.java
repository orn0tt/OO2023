package br.com.senai.exercicios;

public class TestarMedico {

	public static void main(String[] args) {

		Medico medico = new Medico("1223", "Marcio", 5000., 300.);
		
		medico.pagamentoEmDinheiro(400);
		medico.pagamentoPlano(400);
		
		System.out.println("O salário do médico é: " + medico.getSalario());
	}

}
