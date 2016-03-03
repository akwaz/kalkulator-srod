package kalkulator_srod;

import java.util.Calendar;
public class Simulation {
	
	private Calendar start, end;
	
	public Simulation(Calendar calEnd, Calendar calStart) {
		start = calStart;//Calendar.getInstance();
		end = calEnd;
		//og�lnie to sprawdzam czy dzi� nie jest przypadkiem �roda
		//je�eli tak to je�li jest po 16:00 uznajemy �e �roda min�a
		//fajne
		
		if (start.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY && start.get(Calendar.HOUR_OF_DAY) >= 16)
			start.add(Calendar.DAY_OF_MONTH, 1);
	
		
		if (start.compareTo(end) > 0) {
			
		}
	}

	public int howManyWeds() {
		int numOfWeds = 0;
		
		while(start.compareTo(end) < 0){
			if (start.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY){
				numOfWeds++;
			}
			start.add(Calendar.DAY_OF_MONTH, 1);
		}
		
		return numOfWeds;
	}

}
