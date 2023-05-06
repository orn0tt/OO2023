package exercicio1;

public class Teste {

	public static void main(String[] args) {

		Telefone[] telefones = new Telefone[2];
		Telefone telefone1 = new Telefone("2234-1250");
		Telefone telefone2 = new Telefone("2237-1350");
		telefones[0] = telefone1;
		telefones[1] = telefone2;
		Estado estado1 = new Estado("Rio de Janeiro", "RJ");
		Cidade cidade1 = new Cidade("Petrópolis", estado1);
		Endereco endereco1 = new Endereco("Rua Fonseca Ramos", "Centro", "181", cidade1);
		Contato contato1 = new Contato("Roberta", endereco1);

		contato1.setTelefones(telefones);

		System.out.println("Nome: " + contato1.getNome());
		System.out.println(contato1.getEndereco());
		contato1.mostrarTelefones();
	}
}