package dec2022;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Page12Q36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDateTime dt=LocalDateTime.of(2014, 7, 31,1,1);
dt.plusDays(30);
dt.plusMonths(1);
System.out.println("dt :"+ dt);
System.out.println("ISO FORMAT"+dt.format(DateTimeFormatter.ISO_DATE));  // another qn
	}

}
