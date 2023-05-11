package enumeradores;

public class TestarTurma {

	public static void main(String[] args) {

		Turma turma1 = new Turma("PHP", PeriodoDoCurso.MANHA);
		Turma turma2 = new Turma("Front End", PeriodoDoCurso.INTEGRAL);

		System.out.println(turma1);
		System.out.println(turma2);
	}
}