package exercicios;

public abstract class ColegioAplicacao extends Universidade {

	protected String nomeCoordenador;

	public ColegioAplicacao(String nome, String nomeCoordenador) {
		super(nome);
		this.nomeCoordenador = nomeCoordenador;
	}

	@Override
	public String toString() {
		return "ColegioAplicacao [nomeCoordenador=" + nomeCoordenador + "]";
	}

	public String getNomeCoordenador() {
		return nomeCoordenador;
	}

	public void setNomeCoordenador(String nomeCoordenador) {
		this.nomeCoordenador = nomeCoordenador;
	}

	public abstract void reuniaoPais();
}