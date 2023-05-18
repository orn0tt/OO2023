package br.com.senai.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class ExemploPeriod {

	public static void main(String[] args) {

		// Sem timezone = LocalDate, LocalDateTime e LocalTime
		LocalDate dataDeHoje = LocalDate.now();
		LocalDate dataNascimento = LocalDate.of(2003, 8, 6);

		Period p = Period.between(dataNascimento, dataDeHoje);
		System.out
				.println("Passaram: " + p.getYears() + " anos, " + p.getMonths() + " meses, " + p.getDays() + " dias.");

		LocalDateTime dataHora = LocalDateTime.now();
		LocalTime hora = LocalTime.now();

		System.out.println(dataHora);
		System.out.println(hora);
		System.out.println(hora.plusMinutes(10));
	}
}