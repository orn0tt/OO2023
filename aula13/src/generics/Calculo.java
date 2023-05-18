package generics;

public class Calculo<T extends Number> {

	private T valor;

	public Calculo(T valor) {
		super();
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Calculo [valor=" + valor + "]";
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}
}