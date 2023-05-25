package everyday;

public class UniqueNumberofOccurrences12
{


	static boolean checkUniqueFrequency(int arr[], int n)
	{

		int[] frequency = new int[n + 1];

		// For counting the frequency of each element
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[j] == i) {
					frequency[i - 1]++;
				}
			}
		}

		// Checking if frequency array contains any duplicate
		// or not
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || frequency[i] == 0)
					continue;
				if (frequency[i] == frequency[j]) {

					// If any duplicate frequency then return
					// false
					return false;
				}
			}
		}

		// If no duplicate frequency found, then return true
		return true;
	}

	public static void main (String[] args) {
		// Given array arr[]
		int arr1[] = {1,2,2,1,1,3};
		int arr2[] = {1,2};
		int arr3[] = {-3,0,1,-3,1,1,1,-3,10,0};
		int n1 = arr1.length;
		int n2 = arr2.length;
		int n3 = arr3.length;

		// Function Call
		boolean res1 = checkUniqueFrequency(arr1, n1);
		boolean res2 = checkUniqueFrequency(arr2, n2);
		boolean res3 = checkUniqueFrequency(arr3, n3);

		
			System.out.println(res1);
			System.out.println(res2);
			System.out.println(res3);
		

	}
}

// This code is contributed by aadityaburujwale.


