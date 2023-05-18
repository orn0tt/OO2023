package generics;

public class MeuGenerico<T> {
//T - type

	private T var;

	public MeuGenerico(T var) {
		super();
		this.var = var;
	}

	@Override
	public String toString() {
		return "MeuGenerico [var=" + var + "]";
	}

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}

}