package BinarySearch;

public class SearchElement {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,7,8,9};
		int key =8;
		int indexFound = findElement(arr,0, arr.length-1, key);
		System.out.println("Element Found at "+indexFound);

	}
	static int findElement(int[] arr, int low, int high, int key) {
		
		if(low>high)
			return -1;
		int mid = (low+high)/2;
		if(arr[mid]==key)
			return mid+1;
		if(key>arr[mid])
			return findElement(arr, mid+1,high,key);
		return findElement(arr, low, mid-1,key);
	}

}
