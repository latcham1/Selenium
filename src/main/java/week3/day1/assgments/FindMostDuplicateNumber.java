package week3.day1.assgments;


import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindMostDuplicateNumber {
	public static void main(String[] args) {
		String input="abbaba";
		int count=0;
				char[] ch = input.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i]))
			{
				int value = map.get(ch[i]);
				map.put(ch[i], value+1);
				count++;
			}
			else {
				map.put(ch[i],1);
			}

		}
		System.out.println("the max occurance character is : "+Collections.max(null, null)


	}
}
