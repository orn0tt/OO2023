package enumeradores;

import java.time.LocalDate;

public class Pedido {

	private LocalDate dataPedido;
	private Bebida bebida;
	private Sanduiche sanduiche;

	public Pedido(LocalDate dataPedido, Bebida bebida, Sanduiche sanduiche) {
		super();
		this.dataPedido = dataPedido;
		this.bebida = bebida;
		this.sanduiche = sanduiche;
	}

	@Override
	public String toString() {
		return "Pedido [dataPedido=" + dataPedido + ", bebida=" + bebida + ", sanduiche=" + sanduiche + "]";
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Bebida getBebida() {
		return bebida;
	}

	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	public Sanduiche getSanduiche() {
		return sanduiche;
	}

	public void setSanduiche(Sanduiche sanduiche) {
		this.sanduiche = sanduiche;
	}

	public void imprimirCardapio() {

		System.out.println("---------Bebidas---------");
		for (Bebida bebida : Bebida.values()) {
			System.out.println(bebida.getTipoBebida() + "-" + bebida.getValor());
		}

		System.out.println("---------Sanduíches---------");
		for (Sanduiche sanduiche : Sanduiche.values()) {
			System.out.println(sanduiche.getTipoSanduiche() + "-" + sanduiche.getValor());
		}
	}

	public double calcularPedido() {

		return bebida.getValor() + sanduiche.getValor();
	}
}