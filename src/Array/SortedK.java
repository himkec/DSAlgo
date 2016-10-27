package Array;

import java.util.PriorityQueue;

/*
 * 
 * Find the kth largest element in an unsorted array.
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * 
 * Two ways out of many which can be used
 * 
 * 1. Sort the array and then get the Kth element O(n(logn))
 * 
 * 2. Use Heap (Priority Queue) O(n(logk))
 * 
 */
public class SortedK {
	
	public static int findKthLargest(int[] nums, int k) {
	    PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
	    for(int i: nums){
	    	// add to priority queue
	        q.offer(i);
	        
	        
	        if(q.size()>k){
	        	// retrieves from queue
	            q.poll();
	        }
	    }
	    // retrieve
	    return q.peek();
	}
	
	public static void main (String [] args){
		int [] a= {1,2,5,3,9,7,4};
		System.out.println(findKthLargest(a,3));
	}
}
