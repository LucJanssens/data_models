package simple;

import java.time.LocalDate;
import java.time.Period;

public class PersonUtils {
	public static int getAge(Person person) throws NullPointerException{
		return Period.between(person.getBirthDate(), LocalDate.now()).getYears();		
	}
}