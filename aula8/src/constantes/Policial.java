package constantes;

//Final na classe torna a classe imutável - não pode ter filhos
public class Policial {

	private String cpf, nome;

	// Final no atributo - serve como constante no atributo abaixo
	private final String lotacao = "Brasília";

	public Policial(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Policial [cpf=" + cpf + ", nome=" + nome + ", lotacao=" + lotacao + "]";
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLotacao() {
		return lotacao;
	}

	// final no método não deixa sobrescrita
	public String listarInformações() {
		return "nome: " + nome + "lotação" + lotacao;
	}
}