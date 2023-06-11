package vceguide;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q149 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LocalDateTime date=LocalDate
				.parse(“2014-05-04”)
				.format(DateTimeFormatter.ISO_DATE_TIME);  // another qn
		System.out.println(date);
	}

}


