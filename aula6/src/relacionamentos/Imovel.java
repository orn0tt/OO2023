package relacionamentos;

public class Imovel {

	private String tipo, local;
	private double valor;
	private Pessoa pessoa;

	public Imovel(String tipo, String local, double valor, Pessoa pessoa) {
		super();
		this.tipo = tipo;
		this.local = local;
		this.valor = valor;
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "Imovel [tipo=" + tipo + ", local=" + local + ", valor=" + valor + ", pessoa=" + pessoa + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}