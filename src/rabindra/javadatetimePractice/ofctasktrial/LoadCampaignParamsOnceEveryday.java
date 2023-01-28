package rabindra.javadatetimePractice.ofctasktrial;

public class LoadCampaignParamsOnceEveryday {
	

	public static void main(String[] args) {

		
		 long lastRun = 0;
		long currentTime = System.currentTimeMillis();

		if (currentTime - lastRun >= 24 * 60 * 60 * 1000) {
		    // code to reload campaignsParams
			System.out.println("Even if the size is different. Reload the campaign.");
		    lastRun = currentTime;
		} else {
		    System.out.println("Won't reload CampaignsParams");
		}
		
	}

}
