package everyday;

public class EveryElementAppearsTwiceExceptForOneFindThatSingleOne {
	public static void main(String[] args) {
		int [] nums = {4,1,2,1,2};
		int result=0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if ((nums[i])==(nums[j]))
				{
					continue;
				}
				else
				{
					result= nums[i];
					break;
				}
			}
		}
		System.out.println(result);
	}
}
