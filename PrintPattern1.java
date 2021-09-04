
public class PrintPattern1 {

	public static void main(String[] args) {
		int line = 5;
		for (int i = 1; i < line; i++) {
			for (int j = line; j >= 1; j--) {
				if (j != i) {
					System.out.print( j);
				} else
					System.out.print("* ");

			}

			System.out.println();
		}

	}

}
