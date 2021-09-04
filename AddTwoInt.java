import java.util.Scanner;

public class AddTwoInt {

	public static void main(String[] args) {
		int n, a = 0, b = 0, c = 0;
		System.out.println("Enter A : ");
		Scanner integer = new Scanner(System.in);
		a = integer.nextInt();

		System.out.println("Enter B : ");
		Scanner integer1 = new Scanner(System.in);
		b = integer.nextInt();

		c = a + b;

		System.out.println("Sum is : " + c);
	}

}
