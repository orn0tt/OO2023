package br.com.senai.revisao;

import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa {

	private String crm;
	private Double valorConsulta;
	private Especialidade especialidade;
	private List<Consulta> consultas = new ArrayList<>();

	public Medico(String nome, String cpf, String email, String crm, Double valorConsulta,
			Especialidade especialidade) {
		super(nome, cpf, email);
		this.crm = crm;
		this.valorConsulta = valorConsulta;
		this.especialidade = especialidade;
	}

	@Override
	public String toString() {
		return super.toString() + " CRM: " + crm + " Email: " + email + " Valor da consulta: " + valorConsulta;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public Double getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(Double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void adicionarConsultas(Consulta consulta) {

		consultas.add(consulta);
	}
}