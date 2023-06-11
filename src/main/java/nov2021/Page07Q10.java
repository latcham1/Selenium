package nov2021;

public class Page07Q10 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5); // Int no construtor do StringBuilder defini a largura da string. A mesma é iniciada vazia ou "".
		String s = "";
		System.out.println("sb = "+sb);
		System.out.println("s="+s);
		System.out.println("sb.toString() ="+ sb.toString());
		System.out.println("sb.toString() ="+s.toString());
		if(sb.equals(s)) {
		System.out.println("Match 1");
		} else if (sb.toString().equals(s.toString())) {
		System.out.println("Match 2");
		} else {
		System.out.println("No Match");
		}
		}
}
