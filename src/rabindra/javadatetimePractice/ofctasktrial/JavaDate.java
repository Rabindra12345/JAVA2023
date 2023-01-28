package rabindra.javadatetimePractice.ofctasktrial;

import java.time.LocalDateTime;

public class JavaDate {

	public static void main(String [] args) {
		
		//logic
		int nextRun=LocalDateTime.now().getHour();
		int nextRunMin = LocalDateTime.now().getMinute();
		
		int campaignsParams =3;
		int count =3;
		
		if (campaignsParams== count) {
			System.out.println("Size is Different will reload CampaignsParams map");
		} else {
			
			if(nextRun==12 && nextRunMin==4) {
				System.out.println("Even if Size is Same. Will reload CampaignsParams");
			}
			System.out.println("Size is Same. Won't reload CampaignsParams");
		}
	}
	
	
			
}
