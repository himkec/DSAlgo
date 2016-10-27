package DynamicProgramming;

public class BalancedPartitioning {
	
	// Partition problem is to determine whether a given set can be partitioned into two subsets 
	// such that the sum of elements in both subsets is same.
	
	// Following are the two main steps to solve this problem:
	// 1) Calculate sum of the array. If sum is odd, there can not be two subsets with equal sum, so return false.
	// 2) If sum of array elements is even, calculate sum/2 and find a subset of array with sum equal to sum/2.
	
	public void balancedPartioning(int [] a){
		
		int sum = 0;
		
		for (int i=0;i<a.length;i++){
			sum = sum + a[i];
		}
		
		if (sum%2==0){
			boolean part[][]=new boolean[sum/2+1][a.length+1];
			// initialize top row as true
	        for (int i = 0; i <= a.length; i++)
	            part[0][i] = true;
			
		} else 
		{
			System.out.println("Cannot create equal partition");
		}
				
		
	}
}
