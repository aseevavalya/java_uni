package a6;

import java.util.List;

public class Assertions {
	public static void main(String[] args) {
		String language = args[0];
		String weekday = args[1];
		
		List<String> translatedWeekdays = WeekdayService.getWeekStrings(language);
		
		switch (weekday) {
			case "Montag": 
				System.out.println("Der " + weekday + " heißt auf " + language + " " + translatedWeekdays.get(0) + ".");
				break;
			case "Dienstag": 
				System.out.println("Der " + weekday + " heißt auf " + language + " " + translatedWeekdays.get(1) + ".");
				break;
			case "Mittwoch": 
				System.out.println("Der " + weekday + " heißt auf " + language + " " + translatedWeekdays.get(2) + ".");
					break;
			case "Donnerstag": 
				System.out.println("Der " + weekday + " heißt auf " + language + " " + translatedWeekdays.get(3) + ".");
					break;
			case "Freitag": 
				System.out.println("Der " + weekday + " heißt auf " + language + " " + translatedWeekdays.get(4) + ".");
					break;
			case "Samstag": 
				System.out.println("Der " + weekday + " heißt auf " + language + " " + translatedWeekdays.get(5) + ".");
					break;
			case "Sonntag": 
				System.out.println("Der " + weekday + " heißt auf " + language + " " + translatedWeekdays.get(6) + ".");
					break;
			default: 
				assert false : weekday + " ist nicht bekannt.";
		}
	}

}
