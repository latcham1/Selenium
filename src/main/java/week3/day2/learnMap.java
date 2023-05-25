package week3.day2;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;



public class learnMap {

	public void learnMap1(String input) {
		char[] ch = input.toCharArray();
		Map<Character, Integer> map =new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				int value = map.get(ch[i]);
				map.put(ch[i], value+1);
			}
			else
			{
				map.put( ch[i], 1);
			}
		}
		System.out.println("method1: map.containsKey(ch[i]) : " + map);
	}
	public void learnMap2(String input){
		char[] ch = input.toCharArray();
		Map<Character, Integer> map =  new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
		}
		System.out.println("method 2 map.getOrDefault : "+ map);
	}
	public void learnMap3(String input) {
		// TODO Auto-generated constructor stub
		//print only unique character
		char[] ch = input.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
		}
		
	for(Entry<Character, Integer> entry : map.entrySet()) {
		if(entry.getValue()==1)
		{
			System.out.println("map.entrySet method"  + entry.getKey());
		}
	}
			
		}
	public void learnMap4(String input) {
		// TODO Auto-generated constructor stub
		int maxoccur=0;
		char maxchar;
		char[] ch = input.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
		}
		for (Entry<Character, Integer> entry : map.entrySet())
		{
			if (entry.getValue()>maxoccur)
			{
				 maxoccur = entry.getValue();
				maxchar=  entry.getKey();
			}
		}
		System.out.println(maxoccur);
		
	}
		
	
	public static void main(String[] args) {
		learnMap le =  new learnMap();
		le.learnMap1("amazon");
		le.learnMap2("amazon");
		le.learnMap3("amazon");
		le.learnMap4("amazon");
	}
}


