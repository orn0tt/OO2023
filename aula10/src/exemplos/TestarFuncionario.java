package exemplos;

public class TestarFuncionario {

	public static void main(String[] args) {

		Funcionario[] funcionarios = new Funcionario[3];

		funcionarios[0] = new Funcionario("Roni", 4000);
		funcionarios[1] = new Funcionario("Gabriel", 9000);
		funcionarios[2] = new Funcionario("Rodrigo", 7000);

		for (int i = 0; i < funcionarios.length; i++) {
			funcionarios[i].aumentarSalario(200);
			System.out.println(funcionarios[i]);
		}
	}
}