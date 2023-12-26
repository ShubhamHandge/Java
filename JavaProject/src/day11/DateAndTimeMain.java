package day11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating system date, time and timestamp
	LocalDate today	= LocalDate.now();
	LocalTime currentTime = LocalTime.now();
	LocalDateTime currentTimeStamp = LocalDateTime.now();
	
	System.out.println(today);
	System.out.println(currentTime);
	System.out.println(currentTimeStamp);
	
	//Customizeing the date:
			LocalDate independenceDate = LocalDate.of(1947, 8, 15);
			System.out.println(independenceDate);
			
			LocalDate nextTwoDay	= today.plusDays(2);
			System.out.println(nextTwoDay);
			
				
	}

}
