import java.util.Arrays;

public class SmallElementInArray {

	public static int getSmallest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[0];
	}
	
	
	public static int getSecondSmallest(int[] a, int total) {
		Arrays.sort(a);
	return a[1];
	}
	

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 3, 2 };
		//int b[] = { 44, 66, 99, 77, 33, 22, 55 };
		System.out.println("Smallest: " + getSmallest(a, 6));
		System.out.println("Smallest: " + getSecondSmallest(a, 6));
	}
}

                            //OR//

/*
 * public static void main(String[] args) { int arr[] = new int[] { 12, 34, 54,
 * 78 }; int min =arr[0]; for (int i = 0; i < arr.length; i++) { if (arr[i] <
 * min) { min = arr[i]; }
 * 
 * } System.out.println("Min is: " + min);
 * 
 * }
 */
