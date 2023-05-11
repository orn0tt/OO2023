package enumeradores;

public class Funcionario {

	private String cpf, nome;
	private final int ANO_CONCURSO;

	public Funcionario(String cpf, String nome, int aNO_CONCURSO) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		ANO_CONCURSO = aNO_CONCURSO;
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

	public int getANO_CONCURSO() {
		return ANO_CONCURSO;
	}

}