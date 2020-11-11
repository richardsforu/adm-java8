package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class DateFormatterDemo {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		System.out.println(date);

		DateTimeFormatter inBuiltFormatter1 = DateTimeFormatter.ISO_DATE;
		String iso = date.format(inBuiltFormatter1);
		System.out.println(iso);

		DateTimeFormatter ft = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String ft1 = date.format(ft);
		System.out.println(ft1);
		ft = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		String ft2 = date.format(ft);
		System.out.println(ft2);

		ft = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		String ft3 = date.format(ft);
		System.out.println(ft3);

		ft = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		String ft4 = date.format(ft);
		System.out.println(ft4);

		String ft5 = date.format(DateTimeFormatter.ofPattern("dd/MMM/yy"));

		System.out.println(ft5);

		LocalDateTime todayKolkata = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date in IST=" + todayKolkata);

		LocalDateTime todayDubai = LocalDateTime.now(ZoneId.of("Asia/Dubai"));
		System.out.println("Current Date in Dubai = " + todayDubai);

		LocalDateTime todayAmerica = LocalDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("Current Date in America = " + todayAmerica);

		LocalDate dateFromBase = LocalDate.ofYearDay(2020, 1);
		System.out.println(dateFromBase);

		LocalDate localDate = LocalDate.now();

		System.out.println(localDate);

		LocalDate targetDate = localDate.plusYears(13);

		System.out.println(targetDate);

		LocalDate targetDate1 = localDate.plusDays(657);

		ft = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

		System.out.println(ft.format(targetDate1));

		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1981, Month.DECEMBER, 16);
		
		System.out.println(today);
		System.out.println(birthday);
		
		
        LocalDate nextBDay = birthday.withYear(today.getYear());
        
      //If your birthday has occurred this year already, add 1 to the year.
        if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
            nextBDay = nextBDay.plusYears(1);
        }
        
        System.out.println(nextBDay);
        
        
        Period p = Period.between(today, nextBDay);
       // System.out.println(p);
        long p2 = ChronoUnit.DAYS.between(today, nextBDay);
       
        System.out.println(p2);
        
        System.out.println("There are " + p.getMonths() + " months, and " +
                p.getDays() + " days until your next birthday. (" +
                p2 + " total)");

        
        
        
        
        

		
		
		
		
		

	}

}
