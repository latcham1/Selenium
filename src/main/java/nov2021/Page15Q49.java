package nov2021;

public class Page15Q49 {
	public static String maskCC(String creditCard){
		String x ="xxxx-xxxx-xxxx-";		//c
//		StringBuilder sb = new StringBuilder(x);
//		sb.append(creditCard,15,19);
//		return sb.toString();
		
		 return x + creditCard.substring(15,19); //B 
		}
		public static void main(String[] args) {
		System.out.println(maskCC("1234-5678-9101-1121"));
		}
}
