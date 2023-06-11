package may23;

public class Page08Q19 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int data [] = {2010,2013,2014,2015,2014};
		int count =0;
		for (int e : data)
		{
			int key = 2014;
			if (e!=key)
			{
				continue:
				count++;
			}
		}
System.out.println(count +"Found");
	}

}
