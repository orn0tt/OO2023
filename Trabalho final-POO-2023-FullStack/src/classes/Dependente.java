package classes;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Set;

import enums.Parentesco;
import exceptions.DependenteException;

public class Dependente extends Pessoa {
	Parentesco parentesco;
	private static Set<String> cpfsCadastrados = new HashSet<>();
	
	public Dependente(String nome, String cpf, LocalDate dataNascimento, Parentesco parentesco) throws DependenteException {
		super(nome, cpf, dataNascimento);
		validarDependente();
		cpfsCadastrados.add(cpf);
		this.parentesco = parentesco;
	}

	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public LocalDate getNascimento() {
		return dataNascimento;
	}

	public Parentesco getParentesco() {
		return parentesco;
	}
	
	public String toString() {
		return nome + ";" + cpf + ";" + dataNascimento + ";" + parentesco;
	}
	
	private void validarDependente() throws DependenteException {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        int idade = periodo.getYears();
        if (idade >= 18) {
            throw new DependenteException("O dependente tem 18 anos ou mais.");
        }
    }
	
}