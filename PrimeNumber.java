import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// int number=7;
		int flag = 0;
		// int m= number/2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Ener a number to check:");
		int number = sc.nextInt();
		// int m= number/2;
		if (number == 0 || number == 1) {
			System.out.println("Not prime number");
		} else {
			for (int i = 2; i <= number / 2; i++) {
				if (number % 2 == 0) {
					System.out.println("Not prime number");
					flag = 1;
					break;

				}
			}
			if (flag == 0) {
				System.out.println(" Prime number");
			}
		}

	}

}
