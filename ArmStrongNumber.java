
public class ArmStrongNumber {

	public static void main(String[] args) {
		int number = 152;
		int temp=0;
		int r;
		int armstrong=0;
		number = temp; 
		while(number>0) {
		r = number % 10;
		number /= 10;
		armstrong +=(r*r*r);
		}
		if(temp == armstrong)
		{
		System.out.println("armstrong");
		}
		else
			System.out.println("Not armstrong");

	}

}
