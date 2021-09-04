
public class Pattern2 {

	public static void main(String[] args) {
		int Alphabet = 65;
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (Alphabet + j) + " ");

			}
			System.out.println();

		}

	}

}
