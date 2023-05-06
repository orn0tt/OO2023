package exemplos;

public class Medico extends Plano {

	protected String nome;
	protected int crm;

	public Medico(String empresa, String nome, int crm) {
		super(empresa);
		this.nome = nome;
		this.crm = crm;
	}

	@Override
	public String toString() {
		return super.toString() + " - " + nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	@Override
	public double calcularPagamento() {
		return valorPago = super.calcularPagamento() * 1.10;
	}
}