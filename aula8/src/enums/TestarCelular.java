package enums;

public class TestarCelular {

	public static void main(String[] args) {

		Celular c1 = new Celular(10, MarcaCelular.MOTOROLA, "EDGE");
		Celular c2 = new Celular(10, MarcaCelular.HUAWEI, "SB10");

		System.out.println(c1);
		System.out.println(c2);
		System.out.println("----------------");

		for (MarcaCelular mc : MarcaCelular.values()) {
			System.out.println(mc);
		}
	}
}