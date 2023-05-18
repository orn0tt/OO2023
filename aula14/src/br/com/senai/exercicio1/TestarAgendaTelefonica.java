package br.com.senai.exercicio1;

public class TestarAgendaTelefonica {

	public static void main(String[] args) {

		AgendaTelefonica agenda = new AgendaTelefonica();

		agenda.inserir("Kauan", "151924");
		agenda.inserir("Lucas", "192475");
		agenda.inserir("Rodrigo", "128375");
		agenda.inserir("Roni", "9053412");
		agenda.inserir("Joao", "23752512");
		agenda.inserir("Artur", "875235");

		System.out.println(agenda.buscar("Lucas"));

		agenda.remover("Lucas");

		System.out.println(agenda.tamanho());

		System.out.println(agenda.getColecao());
	}
}