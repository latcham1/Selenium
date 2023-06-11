package may23;

public class Page06Q10Vowel {
	private char var;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
char var1='a';
char var2= var1;
var2='e';
Page06Q10Vowel obj1 = new Page06Q10Vowel();
Page06Q10Vowel obj2 = obj1;
obj1.var = 'i';
obj2.var = 'o';
System.out.println(var1+ ", "+var2);
System.out.println(obj1.var+ ", "+obj2.var);
	}

}
