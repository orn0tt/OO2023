package br.com.senai.exemplos;

public class Setor {

	private int codigo, qtdeFuncionarios;
	private String nome;
	
	
	// Construtor Padrão ou Default:
	public Setor() {
		System.out.println("Construtor vazio.");
	}
	
	
	// Contrutor com o nome do setor
	public Setor(String nome, int codigo, int qtdeFuncionarios) {
		System.out.println("Construtor cheio com todos os atributos.");
		this.nome = nome;
		this.codigo = codigo;
		this.qtdeFuncionarios = qtdeFuncionarios;
	}
	
	public Setor (String nome) {
		System.out.println("Construtor com nome.");
		this.nome = nome;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQtdeFuncionarios() {
		return qtdeFuncionarios;
	}

	public void setQtdeFuncionarios(int qtdeFuncionarios) {
		this.qtdeFuncionarios = qtdeFuncionarios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
