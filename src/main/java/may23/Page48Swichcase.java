package may23;

public class Page48Swichcase 
{
	public static void main(String[] args) 
	{
		int wd=0;
		String days[]= {"sun", "mon", "wed", "sat"};
		System.out.println(days.length);
		for (String s : days) 
		{			
			switch (s) 
			{
			case "sat":
			case"sun":
				wd-=1;
				System.out.println("wd-=1 ="+wd);
				break;
			case"mon":
				wd++;
				System.out.println("wd++ ="+wd);
			case "wed":
				wd+=2;
				System.out.println("wd++ ="+wd);
			}
		}
		System.out.println(wd);

	}
}
