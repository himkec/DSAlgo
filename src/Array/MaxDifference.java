package Array;

public class MaxDifference {
	
	public static int maxDiff(int [] a){
		int diff = 0;
		for (int i=0;i<a.length;i++){
			for (int j= i+1;j<a.length;j++){
				if (diff < a[j]-a[i]){
					diff = a[j]-a[i];
				}
			}
		}
		
		return diff;
	}
	
	// Here instead of finding difference with all the elements , we want to take the difference with
	// the minimum element found so far
	// We need to carry two pointers here
	// minimum element
	// maximum difference
	public static int maxDifference(int [] arr) 
    {	
		// assuming max difference is a1 -a0
        int max_diff = arr[1] - arr[0];
        // min element is a0
        int min_element = arr[0];
        int i;
        for (i = 1; i < arr.length; i++) 
        {	
        	if (arr[i] < min_element)
                min_element = arr[i];
            if (arr[i] - min_element > max_diff)
                max_diff = arr[i] - min_element;
            
        }
        return max_diff;
    }
	
	public static void main(String [] args){
		int [] a = {3,6,8,11,2,9,11};
		//System.out.println(maxDiff(a));
		
		System.out.println(maxDifference(a));
	}

}
