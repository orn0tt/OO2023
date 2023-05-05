package br.com.senai.exercicio1;

import javax.swing.JOptionPane;

public class TestarFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("Adriano", 3000.);

		JOptionPane.showMessageDialog(null,
				"Nome: " + funcionario.getNome() + "\nSalário: " + funcionario.getSalario() + "\nINSS : "
						+ funcionario.calcularINSS() + "\nVale Transporte: " + funcionario.calcularValeTransporte()
						+ "\nSalário Líquido: " + (funcionario.getSalario() - funcionario.calcularINSS() - funcionario.calcularValeTransporte()));
	}
}