package may23;

import java.util.*;


public class Page11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List  names = new ArrayList ();
names.add("Robb");
names.add("Bran");
names.add("Rick");
names.add("Bran");
//System.out.println(account.getAmount());

if (names.remove("Bran")) {
	names.remove("Jon");
}
System.out.println(names);
	}
}
