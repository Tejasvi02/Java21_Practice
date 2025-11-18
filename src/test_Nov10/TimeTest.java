package test_Nov10;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class TimeTest {
//	Given that the local time where the code is run is 3PM and
//	the local time zone is 2 hours ahead of UTC, what will the above code print?
//	(Assume that the date is 20th Jan 2021).

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instant instant = Instant.now();
		//System.out.print(instant);
		//Z is UTC
		
		
		LocalDate ld = LocalDate.now().withMonth(6).withDayOfMonth(2);
		//LocalDate ld = LocalDate.now().withMonth(11).withDayOfMonth(2);
		//this will be 5 hour cos daylight saving ended
		LocalTime lt = LocalTime.of(6, 0, 0);
		LocalDateTime ldt = ld.atTime(lt);
		ZoneOffset nyOffset = ZoneOffset.ofHoursMinutes(-5, 0);        
		ZoneId nyZone = ZoneId.of("America/New_York");
		OffsetDateTime nyOdt = ldt.atOffset(nyOffset);
		//it will add 5 hours but display -05.00
		System.out.println(nyOdt);
		ZonedDateTime nyZdt = ldt.atZone(nyZone);
		System.out.println(nyZdt);
		Duration d = Duration.between(nyOdt, nyZdt);
		System.out.println(d);
		
		System.out.println("==============================================================");
		
//		Given that Daylight Savings Time ends on Nov 1 at 2 AM in US/Eastern time zone, 
//		what will the following code print 
		
		LocalDateTime ld1 = LocalDateTime.of(2022, Month.OCTOBER, 31, 10, 0);
		ZonedDateTime date = ZonedDateTime.of(ld1, ZoneId.of("US/Eastern"));
		date = date.plus(Duration.ofDays(1));
		System.out.println(date);

		date = ZonedDateTime.of(ld1, ZoneId.of("US/Eastern"));
		date = date.plus(Period.ofDays(1));
		System.out.println(date);
		System.out.println(Period.ofDays(1)); //P1D
		System.out.println(Duration.ofDays(1)); //PT24H
		
		System.out.println("==============================================================");
//		Local Time is  10 AM when code is executed
		LocalTime now = LocalTime.now();
		LocalTime gameStart = LocalTime.of(10, 15);
		long timeConsumed = 0;
		long timeToStart = 0;
		if(now.isAfter(gameStart)){
		    timeConsumed = gameStart.until(now, ChronoUnit.HOURS);
		}else{
		    timeToStart = now.until(gameStart, ChronoUnit.HOURS);
		}
		System.out.println(timeToStart + " " + timeConsumed);

		System.out.println("==============================================================");
		Instant ins = Instant.parse("2024-06-25T06:43:30.00z");
		ins.plus(10, ChronoUnit.HOURS);
		System.out.println(ins.plus(-10, ChronoUnit.HOURS));
	}

}
