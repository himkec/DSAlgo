package List;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
	
	public static void intersection(List<Integer> l1, List<Integer> l2){
		
		List<Integer> i1 = new ArrayList();
		
		for (int l : l1){
			if( isPresent(l2,l)){
				i1.add(l);
			}
			
		}
		
	}
	
	public static boolean isPresent(List<Integer> l1, int data){
		for (int l5 : l1){
			if (l5 == data){
				return true;
			}
		} return false;
	}


}
