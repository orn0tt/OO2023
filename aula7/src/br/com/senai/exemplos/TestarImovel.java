package br.com.senai.exemplos;

public class TestarImovel {

	public static void main(String[] args) {

		Imovel imovel1 = new Imovel("Centro", 289000);
		Imovel imovel2 = new Imovel("Bingen", 310000);

		Proprietario p1 = new Proprietario("Gabriel", imovel1);
		Proprietario p2 = new Proprietario("Juliana", imovel2);

		// Nome do proprietário
		System.out.println("Proprietário: "+p1.getNome());

		// Dados do imóvel que esse proprietário comprou
		System.out.println(p1.getImovel());

		// Imposto que o proprietário vai pagar
		System.out.printf("Imposto: " + "%.2f",p1.getImovel().calcularImpostoTransmissao());
	}
}