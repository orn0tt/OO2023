package exercicio2;

public class Atleta implements Olimpiadas {

	private String nome;
	private double peso;
	private String modalidade;
	private static int totalParticipantes;
	private Pais pais;

	public Atleta(String nome, double peso, Pais pais) {
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;
		
	}
	
	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public static int getTotalParticipantes() {
		return totalParticipantes;
	}

	public Pais getPais() {
		return getPais();
	}

	@Override
	public String verificarSituacao() {
		if (peso > 90) {
			totalParticipantes++;
			modalidade = "Peso pesado";
			return "Participará";
		}
		if (peso >= 60 && peso <= 90) {
			totalParticipantes++;
			modalidade = "Peso médio";
			return "Participará";
		}
		return "não participará";
	}
}