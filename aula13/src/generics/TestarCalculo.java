package generics;

public class TestarCalculo {

	public static void main(String[] args) {

		Calculo<Integer> a = new Calculo<Integer>(10);
		Calculo<Double> b = new Calculo<Double>(20.9);
		
		System.out.println(a.getValor());
		System.out.println(b.getValor());
	}
}