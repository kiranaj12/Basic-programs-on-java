
public class StringPalindromeOrNot {

	public static void main(String[] args) {
		String str = "AmMa";
		String rev = "";
		str = str.toUpperCase();
		for (int i = str.length() - 1; i >= 0; i--)
			rev = rev + str.charAt(i);

		System.out.println("Original : " + str);
		System.out.println("Reverse : " + rev);

		if (str.equals(rev))
			System.out.println(str + " is a palindrome");
		else
			System.out.println(str + " is not a palindrome");

	}

}
