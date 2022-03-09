package Kata;

import java.time.*;

public class AgeInDays {

	  public static String ageInDays(int year, int month, int day) {
		
		  LocalDate today = LocalDate.now();
		  LocalDate birthday = LocalDate.of(year, month, month);
		  Duration duration = Duration.between(birthday, today);
		  long amountOfDays = duration.toDays();
    
		    return  "You are " +  amountOfDays  + " days old";
		  }
	
	public static void main(String[] args) {
		
		System.out.println(AgeInDays.ageInDays(2022,3,8));


	}

}
