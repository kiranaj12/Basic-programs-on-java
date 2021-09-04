class VarargoArguments {
	public int add(int... n) { // Various arguments

		int sum = 0;
		for (int k : n) {
			sum = sum + k;

		}
		return sum;
	}
 
}

public class Varargs {

	public static void main(String[] args) {
		VarargoArguments obj = new VarargoArguments();
int result = obj.add(1,2,3);
		System.out.println(result);
	}

}
