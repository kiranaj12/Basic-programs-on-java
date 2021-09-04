
public class CountCharInString {

	public static void main(String[] args) {
		String string = "Hi Kiran Love u";
		int count = 0;
		int vCount = 0;
		int cCount = 0;

		string = string.toLowerCase();

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ') {
				count++;
			}

			if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o'
					|| string.charAt(i) == 'u') {
				vCount++;
			}
			// if (string.charAt(i) != 'a' || string.charAt(i) != 'e' || string.charAt(i) !=
			// 'i' || string.charAt(i) != 'o'
			// || string.charAt(i) != 'u') {
			// cCount++;
			// }
			
			//or
			
		
			//else {
			//	cCount++;
			//}
			
			//OR
			
			  else if(string.charAt(i) >= 'a' && string.charAt(i)<='z') {   
				  
				  cCount++;
			  }
		}
		System.out.println("Total number of characters in a string: " + count);
		System.out.println("Total number of vowel in a string: " + vCount);
		System.out.println("Total number of Consonants in a string: " + cCount);

	}

}
