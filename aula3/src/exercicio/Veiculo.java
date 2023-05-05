package exercicio;

public class Veiculo {
	String placa, tipoCombustivel;
	double valor;

	// Criar um método para verificar o tipo de combustível
	// Caso seja flex ou Gasolina o retorno do cálculo do IPVA será de 4% do valor
	// do carro
	// Caso seja gás o valor de retorno será sobre o 1,5% do valor do carro

	public double calcularIPVA() {
		if (tipoCombustivel.equals("Flex") || tipoCombustivel.equals("Gasolina")) {
			return valor * 0.04;
		} else {
			return valor * 0.015;
		}
	}
}
