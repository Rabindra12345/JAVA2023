package rabindra.javadatetimePractice.jodatimeapi;

import java.time.LocalTime;
import java.time.ZoneId;

public class JodaTime {

	public static void main(String[] args) {

		LocalTime lt = LocalTime.now();
		
//		LocalTime lt = LocalTime.now(ZoneId.of("America/Los_Angeles"));
		
//		LocalTime lt = LocalTime.now(ZoneId.of("Australia/Sydney"));
//

		System.out.println(lt);
	}

}
