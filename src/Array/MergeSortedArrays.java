package Array;

public class MergeSortedArrays {
	
	public static int [] mergeSortedArrays(int [] a, int [] b){
		
		// for array a
		int i=0;
		// for array b
		int j=0;
		// for array c result
		int k=0;
		
		int [] c = new int[a.length+b.length];
		
		while (i < a.length && j < b.length){
			if (a[i] < b[j]){
				c[k++] = a[i++];
			}
			else
				c[k++] = b[j++];
		}
		
		while(i < a.length){
			c[k++] = a[i++];
		}
		
		while(j < b.length){
			c[k++] = b[j++];
		}
		
		return c;
		
	}
	
	public static void main(String [] args){
		int [] a = {1,3,5,7};
		
		int [] b = {2,4,6,8,9,10};
		
		int [] c = mergeSortedArrays(a,b);
		
		for (int i=0; i< c.length;i++){
			System.out.println(c[i]);
		}
	}

}
