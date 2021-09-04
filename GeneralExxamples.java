
public class GeneralExxamples {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 10) {
			if (i == 5) { // using break statement
				i++;
			}
			break;// it will break the loop continue;
		}
		System.out.println(i);
		i++;
		System.out.println("-------------------------------");

		System.out.println("Hi\nHlo\nBye");
		System.out.println("-------------------------------");
		int n = 30;
		if (n % 2 == 0) {
			if (n >= 1 && n <= 10) {
				System.out.println("Hi");
			} else if (n >= 10 && n <= 20) {
				System.out.println("Hlo");
			} else if (n >= 20 && n <= 30) {
				System.out.println("Kiran");
			}
		} else {
			System.out.println("Byeeee");
		}

		System.out.println("-------------------------------");

		int arr[] = { 2, 3, 1, 2, 1, 3, 44, 55, 55, 44 };
		
	  int count=arr.length;
	  System.out.println(count);
	  System.out.println("-------------------------------");
		for (int m = 0; m < arr.length; m++) {
			for (int n1 = m + 1; n1 < arr.length; n1++) {
				if (arr[m] == arr[n1]) {
					System.out.println(arr[m]);
				}
			}

		}

		System.out.println("-------------------------------");
		int num=5;
		int fact=1;
		for(int x=1;x<=num;x++) {
			 fact=fact*x;
			 //System.out.println(fact);
		}
		 System.out.println(fact);

	}
}