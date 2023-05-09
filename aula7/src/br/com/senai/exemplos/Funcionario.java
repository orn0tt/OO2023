package br.com.senai.exemplos;

//abstract não permite instância desta classe
public abstract class Funcionario {

	protected String nome, cpf, turno;
	protected double salario;

	public Funcionario(String nome, String cpf, String turno, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.turno = turno;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", turno=" + turno + ", salario=" + salario + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public abstract void reajusteSalarial();
}