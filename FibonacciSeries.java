import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		/*int n1=0;
		int n2=1;
		int n3;
		int count=10;
		System.out.println(n1 + " " + n2);
		for(int i=3; i<=count;i++) {
		 n3= n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		}  */
		
		int number,n1=0,n2 = 1,n3;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of Fibonacci numebrs:");
		//System.out.println( n1+ " " +n2  );
		 number  =sc.nextInt();
		 System.out.println(n1 + " " + n2);
		 for(int i=3; i<=number;i++) {
			 n3= n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		 
		 }

	}

}
