package week3.day1.assgments;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//       output= 7;
		Set<Integer> set = new TreeSet<Integer>();

		for (int i = 0; i < data.length; i++) {
			set.add(data[i]);
		}
		List<Integer> list = new LinkedList<Integer>();
		list.addAll(set);
		System.out.println("set" +set);
		System.out.println("List" +list);
		System.out.println("biggest number is : " + Collections.max(list));
		System.out.println("second biggest number : " + list.get(list.size()-2));

	}
}
