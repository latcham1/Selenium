package vceguide;

public class Q71 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n [] [] = {{1, 3}, {2, 3}};
		System.out.println(n.length-1) ;
		for (int i = n.length-1; i >= 0; i--)
		{
			for (int y : n[i])
			{
				System.out.println(y +" " +i) ;
			}
		}
	}

}
