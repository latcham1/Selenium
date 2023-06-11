package vceguide;

public class Q11Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][]arr =new int [2][4];
System.out.println("arr.length" +arr.length);
arr[0]=new int [] {1,3,5,7};
System.out.println("arr[0].length"+ arr[0].length);
System.out.println("arr[1].length"+ arr[1].length);
arr[1]=new int [] {1,3};
for (int[] a : arr) {
	for (int i = 0; i < arr.length; i++) {
		System.out.print(a[i]+" ");
		
	}
}
	}

}
