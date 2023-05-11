package exemplos;

import java.time.LocalDate;

public abstract class Ave extends Animal {

	protected String cor;
	
	public Ave(String nome, LocalDate dataVacinacao, String cor) {
		super(nome, dataVacinacao);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public abstract String voar();
	
	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return null;
	}
}