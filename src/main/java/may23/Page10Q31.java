package may23;

public class Page10Q31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ta="A ";
		System.out.println(ta);
		ta=ta.concat("B "); //A B
		System.out.println(ta);
		String tb="C ";
		ta=ta.concat(tb);// A B C
		System.out.println(ta);
		ta.replace('C', 'D');  // A B D
		System.out.println(ta);
		ta=ta.concat(tb);  // A B D C
		System.out.println(ta);
	}
}
