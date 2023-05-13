package exercicios;

public final class EnsinoMedio extends ColegioAplicacao {

	private int numeroAlunos;

	public EnsinoMedio(String nome, String nomeCoordenador, int numeroAlunos) {
		super(nome, nomeCoordenador);
		this.numeroAlunos = numeroAlunos;
	}

	@Override
	public String toString() {
		return "EnsinoMedio [numeroAlunos=" + numeroAlunos + "]";
	}

	public int getNumeroAlunos() {
		return numeroAlunos;
	}

	public void setNumeroAlunos(int numeroAlunos) {
		this.numeroAlunos = numeroAlunos;
	}

	@Override
	public void reuniaoPais() {

	}

	@Override
	public void fazerMatricula() {

	}
}