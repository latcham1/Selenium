package vceguide;

public class Q98 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String array[] = new String[2];
		int idx=0;
		for(String s:array)
		{array[idx].concat("Element"+idx);// throw java.lang.NullPointerException
		
		idx++;																												
		}
		for(idx=0;idx<array.length;idx++)
		{
		System.out.println(array[idx]);//null null
		}
	}

}
