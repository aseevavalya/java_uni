package a6;
import java.util.ArrayList;
import java.util.List;

public class WeekdayService {

	private static String[][] weekdayStore = {
			{"Deutsch",  "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"},
			{"Englisch", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"},
			{"Spanisch", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"},
			{"Utopiasprache",  "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Samstag2", "Sonntag"},
	};
	
	public static List <String> getWeekStrings(String language) {
		int index = -1;
		
		for (int i = 0; i < weekdayStore.length; i++) {
			if (weekdayStore[i][0].equals(language)) {
				index = i; 
				break;
			}
		}
		
		List<String> weekdays = new ArrayList<String> ();
		if (index == -1) {
			return weekdays;
		} else {
			for (int i = 1; i < weekdayStore[index].length; i++) {
				weekdays.add(weekdayStore[index][i]);
			}
		}
		
		assert weekdays.size() <= 7;
		
		return weekdays;
	}

}
