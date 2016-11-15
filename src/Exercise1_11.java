public class Exercise1_11 {

	public static void main(String[] args) {
		//convert time to seconds
		double daysInYear = 365.0;
		double hoursInDay = 24.0;
		double minutesInHour = 60.0;
		double secondsInMinute = 60.0;
		double secondsInAYear = (daysInYear * hoursInDay * minutesInHour 
				* secondsInMinute);
		//create variables for deaths, births, and immigrants
		double birthsPerSecond = 7.0;
		double deathsPerSecond = 13.0;
		double immigrantsPerSecond = 45.0;
		double population = 312032486.0;
		
		//finding number of actual births, deaths, and immigrants per year
		double births = secondsInAYear / birthsPerSecond;
		double deaths = secondsInAYear / deathsPerSecond;
		double immigrants = secondsInAYear / immigrantsPerSecond;
		
		//display results
		for (int i = 1; i <= 5; i++) {
            population += births + immigrants - deaths;
            System.out.println("Year " + i + " = " + (int)population);

		}
	}
}