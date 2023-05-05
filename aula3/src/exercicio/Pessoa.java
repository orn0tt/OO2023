package exercicio;

public class Pessoa {
	// Atributos encapsulados

	private String nome;
	private double altura, peso;

	// Atribuir valres ao atributo * "this" significa que é do atributo da classe

	public void setNome(String nome) {
		if (nome == null) {
			System.out.println("Nome inválido.");
		} else {
			this.nome = nome;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setPeso(double peso) {
		if (peso < 0) {
			System.out.println("Peso inválido.");
		} else {
			this.peso = peso;
		}
	}

	public double getPeso() {
		return peso;
	}

	// Método encapsulado - visível somente para esta classe

	public double calcularIMC() {

		return peso / (altura * altura);

	}

	// Método que vai ser usado
	public String resultadoIMC() {

		if (calcularIMC() < 18.5) {

			return "abaixo do peso!";

		} else if (calcularIMC() <= 24.9) {

			return "com o peso normal.";

		} else {

			return "acima do peso!";

		}
	}

}