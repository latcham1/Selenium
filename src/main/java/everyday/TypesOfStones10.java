package everyday;
public class TypesOfStones10 {
	public static int stones(String jewels, String stones ) {		{

		int count = 0;
		for(int i=0; i< jewels.length(); i++){
			for(int j=0; j<stones.length(); j++){
				if(jewels.charAt(i) == stones.charAt(j)){ //check if there's a match
					count++;						
				}
			}
		}
		return count;
	}
	}
	public static void main(String[] args) {
		System.out.println("no of stones avable in jwell is:  "+ stones("aA","aAAbbbb" ));
		System.out.println("no of stones avable in jwell is:  "+ stones("z","ZZ" ));	
	}
}