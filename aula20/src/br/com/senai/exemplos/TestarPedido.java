package br.com.senai.exemplos;

import java.time.LocalDate;

public class TestarPedido {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(123, LocalDate.now(), 1000.);
		pedido1.finalizarPedido();

		Pedido pedido2 = new Pedido(124, LocalDate.now(), 2500.) {
			@Override
			public void finalizarPedido() {
				System.out.println("Pedido encerrado!");
			}
		};
		pedido2.finalizarPedido();

		Pedido pedido3 = new Pedido(322, LocalDate.now(), 2330.) {
			public void finalizarPedido() {
				System.out.println("Pedido finalizado!");
			};
		};
		pedido3.finalizarPedido();
	}
}