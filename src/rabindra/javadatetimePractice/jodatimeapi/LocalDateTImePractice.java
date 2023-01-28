package rabindra.javadatetimePractice.jodatimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class LocalDateTImePractice {

	public static void main(String[] args) {
		//it gives a date and time in the format of 2023-01-14T18:25:42.417638332
//		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime ldt = LocalDateTime.of(LocalDate.of(1998, 8, 28), LocalTime.of(10, 56));
		
		//IT GIVES THE DAY NAME OF THE WEEK NOT INTEGER 
		//ldt.getDayOfWeek();
		
		int hour = LocalDateTime.now().getHour();
		
		System.out.println(hour);
	}

}
