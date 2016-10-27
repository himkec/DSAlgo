package String;

import java.util.Arrays;

public class test {

	public static int [] largestNInt(int [] a , int n) throws Exception{
		
		if(a.length < n){
	        throw new Exception("Size of array is less than n integers");
	    }
		 if (a.length == n){
			 Arrays.sort(a);
		        return a;
		  }
	    
	    //creating a new array to return with size = n
	    int [] answer = new int[n];
	    
	    // Sorting the input array using java sort inbulit function
	    Arrays.sort(a);
	    for (int i = 0 ; i< a.length ; i++)
		    System.out.println(a[i]);
	    // Adding the largest n values in the new array
	    
	    for (int i = 0 ; i < n ; i++){
	        
	        answer [i] = a[a.length -(i+1) ];
	    }
	    Arrays.sort(answer);
	    for (int i = 0 ; i< answer.length ; i++)
	    System.out.println(answer[i]);
	    return answer;
	    
	}
	
	public static void main(String [] args) throws Exception{
		int [] a = {3,4,5,1,2};
		largestNInt(a,10);
		
		
	}

}
