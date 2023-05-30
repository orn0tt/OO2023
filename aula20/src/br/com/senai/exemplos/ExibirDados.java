package br.com.senai.exemplos;

import java.util.function.Consumer;

public class ExibirDados implements Consumer<Aluno> {

	@Override
	public void accept(Aluno aluno) {

		System.out.println(aluno);
	}
}