package Array;

public class MergeSort {

	/*public void mergeSort(int [] a){
		
		if (a.length > 1){
			// Split the array in two halves
			int [] left = leftArray(a);
			int [] right = rightArray (a);
			
			// sort the two halves
			mergeSort(left);
			mergeSort(right);
			
			// merge
			merge(a, left, right);
		}
		
	}

	public int[] leftArray(int[] a) {
		int size1 = a.length / 2;
		int[] left = new int[size1];
		for (int i = 0; i < size1; i++) {
			left[i] = a[i];
		}
		return left;
	}

	public int[] rightArray(int[] a) {
		int size1 = a.length / 2;
		int[] right = new int[size1];
		for (int i = size1; i < a.length; i++) {
			right[i] = a[i];
		}
		return right;
	}
	
	
	/// MErging
	
	public static void merge(int[] result, int[] left, int[] right) {
		int i1 = 0; // index into left array
		int i2 = 0; // index into right array

		for (int i = 0; i < result.length; i++) {
			if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
				result[i] = left[i1]; // take from left
				i1++;
			} else {
				result[i] = right[i2]; // take from right
				i2++;
			}
		}
	}*/
	
	public static void mergeSorting(int [] a){
		
		if (a.length > 1){
			
			System.out.println("Before sorting");
			for (int i=0;i< a.length;i++){
				System.out.println(a[i]);
			}
			
			//Step 1 -- create left and right array
			int [] left = leftArray(a);
			int [] right = rightArray(a);
			
			//Step 2 -- recursively sort the two arrays
			mergeSorting(left);
			mergeSorting(right);
			
			// Step 3 -- Merge left and right array
			a = merge(a,left,right);
			
			System.out.println("After sorting");
			for (int i=0;i< a.length;i++){
				System.out.println(a[i]);
			}
		}
	}
	
	public static int [] leftArray(int [] a){
		int size = a.length/2;
		int [] left = new int [size];
		
		for (int i=0; i<size ; i++){
			left[i] = a[i];
		}
		
		
		return left;
		
	}
	
	public static int [] rightArray(int [] a){
		int size = a.length - (a.length/2);
		int [] right = new int [size];
		
		for (int i=0; i<size ; i++){
			right[i] = a[size-1 +i];
		}
		
		
		return right;
		
	}
	
	public static int [] merge(int [] a, int [] left,int [] right){
		// for array a
		int i=0;
		// for array b
		int j=0;
		// for array c
		int k=0;
		
		while (i < left.length && j < right.length){
			if(left[i] < right[j]){
				a[k++] = left[i++];
			}
			else {
				a[k++] = right[j++];
			}
		}
		
		while (i < left.length){
			a[k++] = left[i++];
		}
		
		while (j < right.length){
			a[k++] = right[j++];
		}
		
		return a;
		
	}
	
	public static void main(String [] args){
		int [] a ={1,5,3,9,2,6,10};
		mergeSorting(a);
	}

}
