import java.util.Arrays;
public class BinarySearchUsingDefault {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int key= 5;
		int result = Arrays.binarySearch(arr,key);
		if(result < 0) {
			System.out.println("Not found");
		}
			else
				System.out.println("Found at " + result );
		
	}

}
