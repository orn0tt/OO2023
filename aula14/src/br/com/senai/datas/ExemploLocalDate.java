package br.com.senai.datas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ExemploLocalDate {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		
		System.out.println(hoje);
		
		System.out.println(LocalDate.of(2023, 05, 18));
		System.out.println(LocalDate.parse("2023-05-17"));
		
		System.out.println(hoje.plusDays(30));
		System.out.println(hoje.minusDays(2));
		
		System.out.println(hoje.minus(2, ChronoUnit.YEARS));
		
		System.out.println("O ano atual " + (hoje.isLeapYear()?"é bissexto.":"não é bissexto."));
	}
}