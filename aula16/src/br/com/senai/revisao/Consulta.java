package br.com.senai.revisao;

import java.time.LocalDate;
import java.util.List;

public class Consulta implements Diagnostico {

	private LocalDate dataConsulta;
	private Medico medico;
	private Paciente paciente;

	public Consulta(LocalDate dataConsulta, Medico medico, Paciente paciente) {
		this.dataConsulta = dataConsulta;
		this.medico = medico;
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		return "Data da Consulta: " + dataConsulta + " Medico: " + medico + " Paciente: " + paciente;
	}

	public LocalDate getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(LocalDate dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public List<String> realizarExame(String nome) {
		return null;
	}

	@Override
	public List<String> receituario(List<String> remedios) {
		return null;
	}
}