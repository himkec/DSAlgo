package Array;

import java.util.HashMap;

/*
 * This method will give the array elements pairs whose sum is same as the number given
 * 
 */
public class numberSum {
	
	public static void numSum(int a[], int num){
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i=0;i< a.length;i++){
			if (map.containsKey(a[i])){
				System.out.println("Pairs are : " + a[i] +"...."+ map.get(a[i]));
			}else{
				map.put(num-a[i], a[i]);
			}
		}
		
	}
	
	public static void main (String [] args){
		int a[] = {1,2,3,4,5,0}; 
		int num = 5;
		
		numSum(a,num);
	}

}
