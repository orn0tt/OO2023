package exercicio;

public class TesteIMC {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		/*
		pessoa.nome = "Gabriel";
		pessoa.altura = 1.80;
		pessoa.peso = 75;
		*/
		pessoa.setNome("Gabriel");
		pessoa.setAltura(1.81);
		pessoa.setPeso(72);
		
		System.out.println(pessoa.getNome() + " você está: " + pessoa.resultadoIMC());
		
	}

}
