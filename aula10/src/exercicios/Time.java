package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Time {

	private String nome;
	private String tecnico;
	private List<Atleta> atletas = new ArrayList<Atleta>();

	public Time(String nome, String tecnico) {
		super();
		this.nome = nome;
		this.tecnico = tecnico;
	}

	@Override
	public String toString() {
		return "Time [nome=" + nome + ", tecnico=" + tecnico + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}
	
	public void adiconarAtleta(Atleta a) {
		atletas.add(a);
	}
	
	public void imprimirAtletas() {
		for (Atleta a : atletas) {
			System.out.println(a);
		}
	}

}