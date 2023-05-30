package br.com.senai.exemplos;

import java.time.LocalDate;

public class Pedido {

	private Integer numero;
	private LocalDate dataPedido;
	private Double total;
	private String status;

	public Pedido(Integer numero, LocalDate dataPedido, Double total) {
		super();
		this.numero = numero;
		this.dataPedido = dataPedido;
		this.total = total;
	}

	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", dataPedido=" + dataPedido + ", total=" + total + "]";
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void finalizarPedido() {
		status = "Entregue";
		System.out.println("Produto Entregue No Destino!");
	}
}