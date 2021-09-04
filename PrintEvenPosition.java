
public class PrintEvenPosition {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("Even position elements: ");
		for (int i = 1; i < arr.length; i = i + 2) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		
		
		// array odd elements

		System.out.println("Odd position elements: ");
		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.print(arr[i] + " ");
		}
	}

}
