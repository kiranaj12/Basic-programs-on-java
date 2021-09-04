
public class ExceptionHandling {

	public static void main(String[] args) {
		int a, b, c;
		a = 10;
		b = 0;
		c = 0;
		try {
			c = a / b;
		} catch (Exception e) {
			System.out.println("Arithmetic Exception");

		}
		System.out.println(c);

	}

}
