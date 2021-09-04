
public class WrapperClass {

	public static void main(String[] args) {
		int i = 5; // Premitive Datatype
		Integer ii = new Integer(i); // Wrapper Class
		int j = ii.intValue(); // un-wrapper class
		int value = i; // auto-doxing
		int k = value; // auto-unboxing

	}

}
