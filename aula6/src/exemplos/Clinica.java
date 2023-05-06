package exemplos;

public class Clinica extends Plano {

	private String nome, cnpj;

	public Clinica(String empresa, String nome, String cnpj) {
		super(empresa);
		this.nome = nome;
		this.cnpj = cnpj;
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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}