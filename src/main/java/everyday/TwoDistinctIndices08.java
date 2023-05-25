package everyday;

//import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.HashMap;
import java. util. ArrayList;

public class TwoDistinctIndices08 {

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		for (int i = 0; i<nums.length; i++) {
			List<Integer> indices = map.getOrDefault(nums[i], new ArrayList<Integer>());

			for (int j : indices) {
				if (Math.abs(i - j) <= k) {
					return true;
				}
			}
			indices.add(i);
			map.put(nums[i], indices);
		}
		return false;
	}	
	public static void main(String[] args) {
		int[] a = {1,2,3,1};
		int[] b = {1,0,1,1};
		int[] c = {1,2,3,1,2,3};
		TwoDistinctIndices08 con = new TwoDistinctIndices08();
		System.out.println(con.containsNearbyDuplicate(a,  3));
		System.out.println(con.containsNearbyDuplicate(b,  1));
		System.out.println(con.containsNearbyDuplicate(c,  2));


	}
}

