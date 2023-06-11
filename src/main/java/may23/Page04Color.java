package may23;


import java.util.ArrayList;
import java.util.List;

public class Page04Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List colors =new ArrayList();
colors.add("green");
colors.add("red");
colors.add("blue");
colors.add("yellow");
colors.remove(2);
colors.add("cyan");
System.out.println(colors);
for (int j = 0; j < colors.size(); j++) {
	System.out.println(colors.get(j)+" :"+j);
}

	}

}
