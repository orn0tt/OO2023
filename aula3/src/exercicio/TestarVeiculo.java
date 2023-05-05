package exercicio;

import java.util.Scanner;

public class TestarVeiculo {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		char resposta = 'S';

		do {
			Veiculo veiculo = new Veiculo();

			System.out.println("Digite a placa do veículo: ");
			veiculo.placa = ler.next();

			System.out.println("Digite o tipo de combustível: ");
			veiculo.tipoCombustivel = ler.next();

			System.out.println("Digite o valor do carro: ");
			veiculo.valor = ler.nextDouble();

			System.out.println("O valor do IPVA é: " + veiculo.calcularIPVA());

			System.out.println("Deseja continuar? (S/s)");
			resposta = ler.next().charAt(0);
		} while (resposta == 'S' || resposta == 's');

	}
}
