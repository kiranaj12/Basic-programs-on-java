
public class AsciiOfChar {

	public static void main(String[] args) {
		char ch = 'A';
		char ch1 = 'a';
		int num = 65;
		int num1 = 97;
		
		int Ascii = ch;
		char c = (char) num;
		
		System.out.println("ASCII of given char is : " + (int) ch);
		System.out.println("ASCII of given char is : " + (int) ch1);
		System.out.println("ASCII of given char is : " + Ascii);

		System.out.println("ASCII of given int is : " + (char) num);
		System.out.println("ASCII of given int is : " + (char) num1);
		System.out.println("ASCII of given int is : " + c);
	}

}
