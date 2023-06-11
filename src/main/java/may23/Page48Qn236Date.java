package may23;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Page48Qn236Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate date1=LocalDate.now();
LocalDate date2=LocalDate.of(2014, 6, 20);
LocalDate date3=LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE); //change to "2014-06-20"
System.out.println("date1 :"+ date1);
System.out.println("date2 :"+ date2);
System.out.println("date3 :"+ date3);
LocalDate date = date2.plusDays(5);
System.out.println("date :"+ date);
	}

}
