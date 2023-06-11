package vceguide;

import java.util.Iterator;

public class Q89 
{
	public static void main(String[] args)
	{
		int[] array = {1, 2, 3, 4, 5};
		for (int i = 0; i < array.length; i++)
		{
			System.out.println("i++="+array[i]+" "); 
		}
		for (int i = array.length-1; i >= 0;  i--)
		{
			System.out.println("i-- ="+ array[i]+" "); 
		}

		for(int i=0; i<array.length; i+=2)
		{
			System.out.println("i+=2 ="+array[i]+" ");
		}
		for (int i : array) {
			System.out.println("for each"+i);			
		}
	}
}
