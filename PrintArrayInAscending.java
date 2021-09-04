
public class PrintArrayInAscending {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 3, 2, 5, 4, 6 };
		int temp = 0;

		System.out.println("Size of d array is :" + arr.length);

		// print original array
		System.out.println("Original array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// print array in ascending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		// print in ascending order
		System.out.println("Array in ascending order");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.print("Sum of d array is : " + sum);

		// print array in descending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// if (arr[i] < arr[j]) {
				if (arr[j] > arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		// print in descending order
		System.out.println("Array in ascending order");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		int sum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum1 = sum1 + arr[i];
		}
		System.out.print("Sum of d array is : " + sum1);

	}

}
