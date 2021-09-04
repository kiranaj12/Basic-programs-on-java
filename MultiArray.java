
public class MultiArray {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5 }, { 7, 8, 9, 0 } }; // Jagged array
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
///// Enhance for loop for multiDimArray
		// For one Dimensional array for(int k : a){}
		for (int k[] : a) {
			for (int x : k) {
				System.out.print(" " + x);
			}
			System.out.println();
		}

	}

}
