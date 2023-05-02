package week1.day1;

public class Fibbinocci {
	public static void main(String[] args) {
		int count = 11, firstNum = 0, secNum  = 1;
		System.out.print("Fibonacci Series of "+count+" numbers:");

		for (int i = 1; i <= count; ++i)
		{
			System.out.print(firstNum+",");

			/* On each iteration, we are assigning second number
			 * to the first number and assigning the sum of last two
			 * numbers to the second number
			 */
			int sum  = firstNum + secNum ;
			firstNum = secNum ;
			secNum  = sum ;
		}
	}
}

