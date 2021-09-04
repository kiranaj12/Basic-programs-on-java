
public class ExceptionChecking {

	public static void main(String[] args) {
		int i = 1;
		try {

			if (i < 10) {

				// System.out.println("");
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println(e);

		}

	}

}
