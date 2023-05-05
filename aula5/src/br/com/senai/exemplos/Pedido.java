package br.com.senai.exemplos;

import java.time.LocalDate;

public class Pedido {

	private int numeroPedido;
	private LocalDate dataPedido;
	private int quantidade;
	private double valor;
	private double total;
	private static int contador;
	
	public Pedido(int numeroPedido, LocalDate dataPedido, int quantidade, double valor) {
		super();
		this.numeroPedido = numeroPedido;
		this.dataPedido = dataPedido;
		this.quantidade = quantidade;
		this.valor = valor;
		contador++;
	}
	
	public static int getContador() {
		return contador;
	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public void finalizarPedido() {
		if (dataPedido.getDayOfWeek().getValue() == 7) {
			total = quantidade * valor * 0.90;
		} else {
			total = quantidade * valor;
		}
	}
	
}
