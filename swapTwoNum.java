
public class swapTwoNum {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int temp = 0;
		//swap(num1,num2);
		
		System.out.println("Before swap ");
		System.out.println(num1 + " " + num2);
		
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swap ");
		System.out.println(num1 + " " + num2);
		

	}

}
