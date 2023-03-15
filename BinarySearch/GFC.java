package BinarySearch;

import java.io.*;
import java.util.Arrays;
 
class GFC{
     
static int singleelement(int arr[], int n)
{
    int low = 0, high = n - 2;
    int mid;
     
    while (low <= high)
    {
        mid = (low + high) / 2;
        if (arr[mid] == arr[mid ^ 1])
        {
            low = mid + 1;
        }
        else
        {
            high = mid - 1;
        }
    }
    return arr[low];
}
 
// Driver code
public static void main(String[] args)
{
    int arr[] = { 2, 3, 5, 4, 5, 3, 4 };
    int size = 7;
    Arrays.sort(arr);
     
    System.out.println(singleelement(arr, size));
    System.out.println(xorApproach(arr,size));
}
static int xorApproach(int arr[], int n) {
	int res=0;//xor of same num is 0 and xor of any num and 0 is num itself
	for(int i=0;i<n;i++) {
		res= res^arr[i];
	}

	return res; 
}
}
 
// This code is contributed by dassohom5
