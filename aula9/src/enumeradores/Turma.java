package enumeradores;

public class Turma {

	private String curso;
	private PeriodoDoCurso periodoDoCurso;

	public Turma(String curso, PeriodoDoCurso periodoDoCurso) {
		super();
		this.curso = curso;
		this.periodoDoCurso = periodoDoCurso;
	}

	@Override
	public String toString() {
		return "Curso: " + curso + " Periodo do curso: " + periodoDoCurso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public PeriodoDoCurso getPeriodoDoCurso() {
		return periodoDoCurso;
	}

	public void setPeriodoDoCurso(PeriodoDoCurso periodoDoCurso) {
		this.periodoDoCurso = periodoDoCurso;
	}
}