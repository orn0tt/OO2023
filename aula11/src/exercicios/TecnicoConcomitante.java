package exercicios;

public final class TecnicoConcomitante extends ColegioAplicacao {

	private String nomeCurso;

	public TecnicoConcomitante(String nome, String nomeCoordenador, String nomeCurso) {
		super(nome, nomeCoordenador);
		this.nomeCurso = nomeCurso;
	}

	@Override
	public String toString() {
		return "TecnicoConcomitante [nomeCurso=" + nomeCurso + "]";
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	@Override
	public void reuniaoPais() {

	}

	@Override
	public void fazerMatricula() {

	}
}