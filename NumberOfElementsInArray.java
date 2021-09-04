
public class NumberOfElementsInArray {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6 };
		int sum = 0;
		System.out.println("No of elements present in array is : " + arr.length);
		
		// sum of the array
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum is : " + sum);
	}

}
