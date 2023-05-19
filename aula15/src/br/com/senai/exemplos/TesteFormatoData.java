package br.com.senai.exemplos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TesteFormatoData {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma data:");
		String data = sc.next();

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate dataFormatada = LocalDate.parse(data, dtf);

		System.out.println(dataFormatada);
		System.out.println(dataFormatada.format(dtf));
	}
}