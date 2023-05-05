package objetos;

public class TestarAluno {
	
	public static void main(String[] args) {
		// Criar um objeto em memoria - Instancia
		Aluno a = new Aluno();
		Aluno b = new Aluno();
		Aluno c = new Aluno();
		
		// Cada new e criado um novo objeto do tipo Aluno em memoria
		new Aluno();
		new Aluno();
		
		a.nome = "Adriano";
		a.email = "adiano@gmail.com";
		
		b.nome = "Antonio";
		b.email = "antonio@gmail.com";
		
		c.nome = "Carla";
		c.email = "carla@gmail.com";
		
		System.out.println(a.nome);
		System.out.println(b.nome);
		System.out.println(c.nome);
	}
}
