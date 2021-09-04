import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		//int number = 5;
		int fact=1;
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter a number:");
		int number = sc.nextInt();
		for(int i = 1; i<=number; i++)
			fact= fact*i;
		System.out.println(fact);
	}

}
