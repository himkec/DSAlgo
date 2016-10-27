package DynamicProgramming;

public class MaxContinuousSum {
		// The problem is in an find the max sum of continuous elements. This array contains positive and negative numbers. 
	
		// Concept : We should ignore the previous sum of n-1 + nth elements if nth element is greater than the sum
		
			public static int maxSubArray(int[] A) {
				
				int max = A[0];
				
				int sum = A[0];
				
				for (int i=1;i< A.length;i++){
					
					sum = Math.max(A[i], sum + A[i]);
					// max is the max between element in i position and max (above step max is max between current element in array or sum)
					max = Math.max(max, sum);
				}
				
				return max;
				
			
			}
			
			public static void main (String [] args){
				int [] a ={1,2,-3,8,9,-5,2,4,-1};
				
				System.out.println(maxSubArray(a));
			}
}
