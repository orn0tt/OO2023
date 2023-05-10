package exercicio1;

public class TestarLivro {

	public static void main(String[] args) {

		Livro l1 = new Livro("Marco Antônio", "Cisco CCNA", 85.00);
		Livro l2 = new Livro("Kathy Sierra", "Use a Cabeça Java", 98.00);

		Operacao o1 = new Operacao("Venda", l1);
		Operacao o2 = new Operacao("Empréstimo", l2);

		l1.reajuste(6);
		o1.venderLivro();

		o2.emprestarLivro();

		System.out.println(o1);
		System.out.println(o2);
	}
}