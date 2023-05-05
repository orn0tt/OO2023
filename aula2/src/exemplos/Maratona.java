package exemplos;

public class Maratona {

	public static void main(String[] args) {
		int idade = 20;
		double altura = 1.55;
		
		if (idade >= 18 || altura >= 1.80) {
			System.out.println("Atleta participara");
		} else {
			System.out.println("Atleta nao participara");
		}
		System.out.println(idade >= 18 || altura >= 1.80 ?"Atleta participara":"Atleta nao participara");
	}

}
