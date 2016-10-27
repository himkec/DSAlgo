package HashTable;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetTest {
	
	public static void main(String [] args){
		
		HashSet<Object> set = new HashSet<Object>();
		set.add(1);
		set.add("Himanshu");
		set.add(2);
		set.add("Bisht");
		set.add(3);
		set.add("Nimisha");
		
		System.out.println(set);
		
		System.out.println(set.contains(4));
		
		
		HashSet<Object> s = new LinkedHashSet<Object>();
		s.add(1);
		s.add("Himanshu");
		s.add(2);
		s.add("Bisht");
		s.add(3);
		s.add("Nimisha");
		
		System.out.println(s);
		
		System.out.println(s.contains(4));
		
		
	}

}
