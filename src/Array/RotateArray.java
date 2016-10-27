package Array;

public class RotateArray {
	
	/*
	 * The funda here is to rotate the array once by using for loop and then recursively 
	 * calling this method to rotate n times
	 * 
	 * The complexity will O(n*d) where n is the length , d is the number of rotations
	 * 
	 */
	
	public static int [] rotateArr(int [] arr, int n){
		
		for (int i=0;i<n;i++){
			arr = ror(arr);
		}
		
		return arr;
	}
	public static int [] ror(int [] arr){
	int temp  = arr[0];
	for (int j =1 ; j< arr.length;j++){
		arr[j-1]=arr[j];
	}
	arr[arr.length-1]=temp;
	return arr;
	}
	public static void main(String [] args){
		int [] arr = {1,2,3,4,5,6};
		
		arr = rotateArr(arr,1);
		
		for (int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
