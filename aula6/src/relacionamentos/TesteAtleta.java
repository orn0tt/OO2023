package relacionamentos;

public class TesteAtleta {

	public static void main(String[] args) {

		Atleta atletaA = new Atleta("Pedro", "ATA", 25);
		Atleta atletaB = new Atleta("Gabi Gol", "ATA", 26);
		Atleta atletaC = new Atleta("Bruno Henrique", "ATA", 32);
		
		Time time = new Time("Flamengo", "Sampaoli", new Atleta[3]);
		
		time.adicionarAtletas(atletaA);
		time.adicionarAtletas(atletaB);
		time.adicionarAtletas(atletaC);
		
		time.listarAtletas();
	}
}