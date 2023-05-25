package everyday;

class IntergerDuplicateArrayReturnTrueFalse_07 {

	 boolean DuplicateArray (int[]nums){
		for  (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i]==nums[j])
					return true;									
			}
		}
		return false;
	}	
	public static void main(String[] args) {
		int[] nums= {1,2,3};
		IntergerDuplicateArrayReturnTrueFalse_07 result = new IntergerDuplicateArrayReturnTrueFalse_07();
		boolean res = result.DuplicateArray(nums);
		System.out.println(res);
	}
}
