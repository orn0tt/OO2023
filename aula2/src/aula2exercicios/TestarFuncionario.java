package aula2exercicios;

import javax.swing.JOptionPane;

public class TestarFuncionario {

	public static void main(String[] args) {
		
		int resposta=0;
		
		do {
			Funcionario funcionario = new Funcionario();

			funcionario.nome = JOptionPane.showInputDialog("Digite o seu nome: ");
			funcionario.telefone = JOptionPane.showInputDialog("Digite o seu telefone: ");
			funcionario.email = JOptionPane.showInputDialog("Digite o seu email: ");
			funcionario.salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário: "));
			
			funcionario.aumentarSalario();
			
			JOptionPane.showMessageDialog(null, "Salário atualizado: " + funcionario.salario);
			resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirme", JOptionPane.YES_OPTION);
		} while (resposta == 0);
		
	}
	
}
