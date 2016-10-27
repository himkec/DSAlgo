package List;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate {
	
	public static void findDup(List<Integer> alist){
		
		HashMap <Integer, Integer> map = new HashMap<>();
		
		for (int a : alist){
			if(map.containsKey(a)){
				map.put(a, map.get(a)+1);
			} else{
				map.put(a, 1);
			}
		}
		
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1){
				System.out.println(entry.getKey() + "..."+entry.getValue());
			}
			
		}
		
	}
	
	public static List findDupSet(List<Integer> alist){
		
		Set <Integer> set = new HashSet<Integer>();
		
		set.addAll(alist);
		alist.clear();
		alist.addAll(set);
		
		return alist;
		
	}
	
	public static void main (String [] args){
		List al = new LinkedList();
		al.add(1);
		al.add(2);
		al.add(5);
		al.add(1);
		al.add(2);
		
		findDup(al);
		
		System.out.println("Using Set");
		List<Integer> afterDup = findDupSet(al);
		for (int a : afterDup ){
			System.out.println(a);
		}
		
	}

}
