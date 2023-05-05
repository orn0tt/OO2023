package br.com.senai.exemplos;

import java.time.LocalDate;

public class TotalPedido {

	public static void main(String[] args) {

		Pedido pedido1 = new Pedido(123, LocalDate.now(), 10, 1000);
		Pedido pedido2 = new Pedido(143, LocalDate.of(2023, 4, 30), 10, 2000);

		pedido1.finalizarPedido();
		pedido2.finalizarPedido();

		System.out.println("O total do pedido 1 é: " + pedido1.getTotal() + " // " + pedido1.getDataPedido());
		System.out.println("O total do pedido 2 é: " + pedido2.getTotal() + " // " + pedido2.getDataPedido());
		
		System.out.println("Total geral de pedidos: " + Pedido.getContador());

	}

}
