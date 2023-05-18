package br.com.senai.datas;

import java.util.Calendar;

public class ExemploCalendar {

	public static void main(String[] args) {

		Calendar hoje = Calendar.getInstance();

		System.out.println(hoje);

		int ano = hoje.get(Calendar.YEAR);

		System.out.println(ano);

		int hora = hoje.get(Calendar.HOUR);

		System.out.println(hora);
	}
}