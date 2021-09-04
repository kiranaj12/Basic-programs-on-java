import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
	/*	//int number=1232;
		int temp=0;
		int sum=0;
		int r;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number check:");
		int number = sc.nextInt();
		temp=number;
		while(number > 0) {
		r = number % 10;
		sum = (sum *10)+r;
		number /= 10;
		}
		if(temp == sum) 
			System.out.println("Palindrome");
		
		else
			System.out.println("Not Palindrome");                */
		
		
		
		// String Palindrome Number
		String str,rev = "";
		str = "kiran";
				
				//Scanner sc = new Scanner(System.in);
				//System.out.println("Enter the string check:");
				//str = sc.nextLine();
				int length = str.length();
				for(int i = length-1; i>=0; i--) {
					rev = rev +str.charAt(i);
				}
				if(str.equals(rev)) {
					System.out.println("Palindrome");
				}
				
				else
					System.out.println("Not Palindrome");               

		
		
	}

}
