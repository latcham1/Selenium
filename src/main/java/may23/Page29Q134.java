package may23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Page29Q134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] arr = {"Hi", "How", "Are", "You"};
			List<E> arrList = new ArrayList<>(Arrays.asList(arr));

			if(arrList.removeIf(s -> { return s.length() <= 2;})){
			System.out.println(s+ "removed");
			};
			}
	}


