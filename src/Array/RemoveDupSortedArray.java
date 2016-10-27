package Array;

public class RemoveDupSortedArray {
	
	public static void DupSort(int [] input){
		int current = input[0];
		boolean found = false;
		
		for (int i = 0; i < input.length; i++) {
		    if (current == input[i] && !found) {
		        found = true;
		    } else if (current != input[i]) {
		        System.out.print(" " + current);
		        current = input[i];
		        found = false;
		    }
		}
		System.out.print(" " + current);
	}
	
	/*
	 *  Put the current element in int current 
	 *  print current first to print first element
	 *  compare the current with elements in the array
	 *  if it matches then its duplicate
	 *  else print the element and put current = new element
	 */
	
	public static void DupSort2(int [] input){
		int current = input[0];
		System.out.print(current);
		for (int i=0;i< input.length;i++){
			if(current == input[i]){
				
			}else{
				System.out.print(" " +input[i]);
				current = input[i];
			}
		}
	}
	
	public static void main(String [] args){
		int[] input = new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
		DupSort(input);
		System.out.println("" +"\n");
		DupSort2(input);
	}

}
