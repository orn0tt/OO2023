package exercicio1;

public class Endereco {

	private String rua, bairro, cep;
	private Cidade cidade;

	public Endereco(String rua, String bairro, String cep, Cidade cidade) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return rua + " " + bairro + " " + cep + " " + cidade;
	}

	public String getRua() {
		return rua;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCep() {
		return cep;
	}

	public Cidade getCidade() {
		return cidade;
	}
}