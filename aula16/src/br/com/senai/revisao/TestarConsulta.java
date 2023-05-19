package br.com.senai.revisao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class TestarConsulta {

	public static void main(String[] args) {

		Medico medico1 = new Medico("José", "123", "J@gmail.com", "1231", 250., Especialidade.CARDIOLOGIA);

		Medico medico2 = new Medico("Patrícia", "343", "P@gmail.com", "3433", 200., Especialidade.ORTOPEDIA);

		Integer resposta = 0, escolha = 0;

		do {

			String nome = JOptionPane.showInputDialog("Informe o nome do paciente: ");

			String cpf = JOptionPane.showInputDialog("Informe o CPF do paciente: ");

			String email = JOptionPane.showInputDialog("Informe o email do paciente: ");

			Integer alergia = JOptionPane.showConfirmDialog(null, "Possui alguma alergia?", "Alergia",
					JOptionPane.YES_OPTION);

			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			LocalDate data = LocalDate.parse(JOptionPane.showInputDialog("Digite uma data: "), formato);

			Paciente paciente = new Paciente(nome, cpf, email, /* ternario: */(alergia == 0 ? true : false));

			JOptionPane.showMessageDialog(null,
					"ESCOLHA O MÉDICO:  \n1." + medico1.getNome() + "\n2." + medico2.getNome());

			escolha = Integer.parseInt(JOptionPane.showInputDialog("Informe o médico desejado: "));

			Consulta consulta = new Consulta(data, /* ternário: */ (escolha == 1 ? medico1 : medico2), paciente);

			if (escolha == 1) {
				medico1.adicionarConsultas(consulta);
			} else {
				medico2.adicionarConsultas(consulta);
			}

			paciente.adicionarConsultas(consulta);

			resposta = JOptionPane.showConfirmDialog(null, "Deseja adicionar uma nova consulta?", "Consultas",
					JOptionPane.YES_OPTION);

		} while (resposta == 0);

		for (Consulta c : medico1.getConsultas()) {
			System.out.println(c);
		}

		System.out.println("--------------------");

		for (Consulta c : medico2.getConsultas()) {
			System.out.println(c);
		}
	}
}