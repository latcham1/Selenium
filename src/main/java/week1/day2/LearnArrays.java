package week1.day2;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class LearnArrays {
	public static void main(String[] args) {
		
	
	int[] nums = {2, 5, 7, 7, 5, 9, 2, 3};
	System.out.println("Duplicate values in this");
	
	for (int i=0;i< nums.length; i++)
	{
		for (int j = i+1; j < nums.length; j++) {
			if (nums[i]==nums[j])
			System.out.println(
					+ nums[i]);
		}
	}
}
	
}
