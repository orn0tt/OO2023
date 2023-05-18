package br.com.senai.datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploDate {

	public static void main(String[] args) {

		Date dataDeHoje = new Date();
		System.out.println("Dia de hoje: "+ dataDeHoje.getDate());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String dataFormatada = sdf.format(dataDeHoje);
		System.out.println(dataFormatada);
	}
}