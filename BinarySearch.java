
public class BinarySearch {
	public static void binarySearch(int arr[],int key,int first,int last) {
		int mid = (first + last)/2;
		while(first<=last) {
			if(arr[mid] <key) {
				first = mid + 1;
			}
			else if(arr[mid] == key) {
				System.out.println(mid);
				break;
			}
			
			else {
				last = mid - 1;
			}
			mid = (first +last)/2;
		}
		if(first>last) {
			System.out.println("not found");
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int key =3;
		int last = arr.length-1;
		binarySearch(arr,0,key,last);

	}

}
