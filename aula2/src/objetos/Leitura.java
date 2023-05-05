package objetos;

import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		int a = ler.nextInt();
		//System.out.println(ler.nextInt());
		
		System.out.println("Informe um número real: ");
		double b = ler.nextDouble();
		//System.out.println(ler.nextDouble());
		
		System.out.println("Informe um texto: ");
		String c = ler.next();
		//System.out.println(ler.next());
		
		System.out.println("Dados: "+ a + " " + b + " " + c);
	}

}
