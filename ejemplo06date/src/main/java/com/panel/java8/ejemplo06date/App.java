package com.panel.java8.ejemplo06date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws InterruptedException {
		String fechaStr = "15/11/2017";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date f1 = null;
		try {
			f1 = sdf.parse(fechaStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// Instant
		Instant i1 = Instant.now();
		Thread.sleep(1);
		Instant i2 = Instant.now();
		System.out.println(i1.toEpochMilli());
		System.out.println(i2);
		i2.isBefore(i1);
		i1.plus(1,ChronoUnit.HOURS);
		// LocalDate
		System.out.println(LocalDate.now());
		LocalDate localDate = LocalDate.now();
		LocalDate of = LocalDate.of(2019, 1, 1);
		of.getDayOfWeek();
		// LocalTime
		LocalTime now = LocalTime.now();
		now.getSecond();
		// LocalDateTime
		LocalDateTime localDateTime = LocalDateTime.now();
		
		// Formateador
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate parse = LocalDate.parse("03/03/2019", pattern);
		// ZoneDateTime
		ZoneId zonaMadrid = ZoneId.of("Europe/Madrid");
		ZoneId zonaCanarias = ZoneId.of("Atlantic/Canary");
		LocalDateTime now2 = LocalDateTime.now();
		//now2.get
		ZonedDateTime zdtMadrid = ZonedDateTime.of(LocalDateTime.now(), zonaMadrid);
		ZoneId zone = zdtMadrid.getZone();
		ZonedDateTime zdtCanarias = zdtMadrid.withZoneSameInstant(zonaCanarias);
		System.out.println("Madrid :"+zdtMadrid.toLocalTime());
		System.out.println("Canarias : "+zdtCanarias.toLocalTime());
		
		
	}
}
