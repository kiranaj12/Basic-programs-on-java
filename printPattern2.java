
public class printPattern2 {

	public static void main(String[] args) {
		int line = 5;
		for (int i = 1; i < line; i++) {
			for (int j = 1; j <= line; j++) {
				if (i==j) {
					System.out.print( "*");
				} else
					System.out.print("1 ");

			}

			System.out.println();
		}

	}

}
