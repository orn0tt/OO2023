package enums;

public class Celular {

	private int tamanho;
	private MarcaCelular marca;
	private String modelo;

	public Celular(int tamanho, MarcaCelular marca, String modelo) {
		super();
		this.tamanho = tamanho;
		this.marca = marca;
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Celular [tamanho=" + tamanho + ", marca=" + marca + ", modelo=" + modelo + "]";
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public MarcaCelular getMarca() {
		return marca;
	}

	public void setMarca(MarcaCelular marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}