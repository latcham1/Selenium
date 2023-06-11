package may23;

public class Page39Q176 {
	public static void main(String[] args) {
		String [] [] chs = new String[2][];
		chs[0] = new String[2];
		chs[1] = new String[5];

		

		int i = 97;//from this line we give the array element values
		for(int a =0; a<chs.length; a++){
		for(int b=0 ; b<chs.length;b++){
		chs[a][b] = "" +i;
		i++;
		}

		}
		for (String[] ca : chs){ //print every element
		for (String s :ca){
		System.out.print(s+" ");
		}
		System.out.println();
		}
		}
}
