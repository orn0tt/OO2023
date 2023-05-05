package exemplos;

public class Conversao {

	public static void main(String[] args) {
		// tipos de variaveis primitivos - armazenam valores
		int a = 1000;
		float b = a;

		double c = 5.25;

		int d = (int) c;
		float e = (float) c;

		// inferencia
		var f = "Teste";
		var g = 1000;
		// && -- "e"
		// || -- "ou"
		// ! -- "diferente"
		boolean h = !(10 == 10);

		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		int avaliacao = 3;
		String resultado = (avaliacao==3?"Otimo":avaliacao==2?"Bom":avaliacao==1?"Regular":"Ruim");
		System.out.println(resultado);
		
		if (avaliacao==3) {
			System.out.println("Ótimo");
		} else if(avaliacao==2){
			System.out.println("Bom");
		}else if (avaliacao==1) {
			System.out.println("Regular");
		}else {
			System.out.println("Ruim");
		}
	}

}
