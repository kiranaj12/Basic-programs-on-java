import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		//Casting 
		byte a = 20;
		byte b = 10;
		byte c = (byte)(a+b);
		System.out.println(c);
		
		//Pre and Post increment operator
		int x=10;  
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10
		
		
		//Shifting operators
		System.out.println(20<<3); //left shift operator
		System.out.println(20>>3);//Right shift operator
		System.out.println(20>>>2);  // >> and >>> both r same for positive
		System.out.println(-20>>2);  // Only sign will changes
		System.out.println(-20>>>2);  
		
		
		System.out.println(a>b|a<c); // it will check both the conditions, If first condition true also
		
		
		
		//Ternary operator
		
		int d = 5;
		int e = 10;
		int min = (d>e)? d:e;
		System.out.println(min);
		
		//if else condition checking
		
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		age = sc.nextInt();
		if(age >= 18)
		{
			System.out.println("Age is " + age );
			
		}
		else
			System.out.println("Not eligible age " + age);
		
		String s = "deepu" ;
		//Scanner stng = new Scanner(System.in);
		//System.out.println("Enter the strig:");
		//String s = stng.nextLine();

		if(s == "deepu")
			
		{
			System.out.println("String is equal ");
			
		}
		else
			System.out.println("Not equal ");
		
		
		// leap year 
		
		int year = 2020;
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
		{
			System.out.println("Leap year");
		}
		else
			System.out.println("Not Leap year");
		
		
		
		
		//Nested if condition
		String name = "deepu";
		int age1 = 10;
		if(name == "kiran")
		{
			if(age1 >= 18)
			{
				System.out.println("Eligible to clear");
			}
			else 
			{
				System.out.println("not eligible");
			}
			
		}
		else
			System.out.println("Age is below 18 sry");
	

		

	

		


		

	}

	

}
