package Array;

public class PeakElements {
	
	/*
	 * A number I is peak if it is greater than I-1 and I+1
	 * 
	 * 
	 */
	
	public static void peakElem(int [] arr){
		
		for (int i=1;i<arr.length-1;i++){
			if ((arr[i] > arr[i-1]) && (arr[i] > arr[i+1])){
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String [] args){
		int [] arr = {2,7,3,5,3,7,8};
		peakElem(arr);
	}

}
