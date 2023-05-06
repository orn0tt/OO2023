package relacionamentos;

public class Time {

	private String nome, treinador;
	private Atleta[] atletas;

	public Time(String nome, String treinador, Atleta[] atletas) {
		super();
		this.nome = nome;
		this.treinador = treinador;
		this.atletas = atletas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTreinador() {
		return treinador;
	}

	public void setTreinador(String treinador) {
		this.treinador = treinador;
	}

	public Atleta[] getAtletas() {
		return atletas;
	}

	public void setAtletas(Atleta[] atletas) {
		this.atletas = atletas;
	}

	public void adicionarAtletas(Atleta atleta) {

		for (int i = 0; i < atletas.length; i++) {
			if (atletas[i] == null) {
				atletas[i] = atleta;
				break;
			}
		}
	}

	public void listarAtletas() {
		for (int i = 0; i < atletas.length; i++) {
			System.out.println(atletas[i]);
		}
	}
}