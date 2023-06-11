package may23;

public class Page45
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String [][] arr = {{"A", "B", "C"}, {"D", "E"}};
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]+ " ");
				if (arr[i][j].equals("B"))
				{
					break;
				}
			}
			continue;
		}
	}
}

