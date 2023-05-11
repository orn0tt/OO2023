package enumeradores;

public class Pessoa {

	enum EstadoCivil {

		CASADO('C'), SOLTEIRO('S'), VIUVO('V'), DIVORCIADO('D');

		private char valor;

		private EstadoCivil(char valor) {
			this.valor = valor;
		}
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", email=" + email + ", setor=" + setor + ", estadoCivil=" + estadoCivil + "]";
	}

	private String nome;
	private String email;
	private Setor setor;
	private EstadoCivil estadoCivil;

	public Pessoa(String nome, String email, Setor setor, EstadoCivil estadoCivil) {
		super();
		this.nome = nome;
		this.email = email;
		this.setor = setor;
		this.estadoCivil = estadoCivil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
}