
public class SelectionSort {
	public static void selctionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					arr[index] = j;

				}

			}
			int smallNum = arr[index];
			arr[index] = arr[i];
			arr[i] = smallNum;
		}
	}

	public static void main(String a[]) {
		int[] arr1 = { 9, 14, 3, 2, 43, 11, 58, 22 };
		System.out.println("Before Selection Sort");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();

		selctionSort(arr1);// sorting array using selection sort

		System.out.println("After Selection Sort");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}
}
