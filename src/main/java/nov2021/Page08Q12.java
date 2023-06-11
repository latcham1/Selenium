package nov2021;

public class Page08Q12 
{
	public static void main(String[] args) 
	{
		int [] intArray = {8,16,32,64,128};
		//		for each:   //
		for(int i : intArray){
			System.out.println(i);
		}
		//		for loop:  //e
		for (int i=0; i<intArray.length;i++)
		{
			System.out.println(intArray[i]);
		}
	}
}