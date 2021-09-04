
public class RemoveWhiteSpaceInStr {

	public static void main(String[] args) {
		String str = "Hi Deepu Kiran";
		str = str.replaceAll("\\s+", "");
		System.out.println(str);

	}

}
