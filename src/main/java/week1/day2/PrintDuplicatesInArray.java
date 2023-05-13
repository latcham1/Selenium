package week1.day2;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		// iterate from 0 to the array length-1 (outer loop starts here)
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length-1; j++) {// iterate from i to 
				//					the length of the array by adding 1 to it (inner loop starts here)
				if (arr[i]==arr[j])// compare both the loop variables & check they're equal
					System.out.print(arr[i]+" ");// print the matching value
			}
		}
	}
}
