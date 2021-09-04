
public class VowelOrConsonent {

	public static void main(String[] args) {
		char ch = 'E';

		switch (ch) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':

			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonants");
		}

		// OR//

		/*
		 * if ((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') || (ch ==
		 * 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
		 * System.out.println("Alphabet"); }
		 * 
		 * else if ((ch != 'A' || ch != 'E' || ch != 'I' || ch != 'O' || ch != 'U') ||
		 * (ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' || ch != 'u')) {
		 * System.out.println("consonants"); }
		 * 
		 * else { System.out.println("Not a char");
		 * 
		 * }
		 */

	}

}
