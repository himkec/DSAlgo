package Array;

public class SortArray {
	
	public static int [] sortArray(int [] a){
		
		for (int i =0 ; i < a.length; i++){
			for (int j= i+1;j < a.length;j++){
				if (a[i] > a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		return a;
	}
	
	public static void main (String [] args){
		int [] a = {5,2,7,4,2,1};
		sortArray(a);
		for (int i =0 ; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
	
}
