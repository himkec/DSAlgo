package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateMap {
	
	public static void main(String [] args){
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Jan");
		map.put("2", "Feb");
		map.put("3", "Mar");
		map.put("4", "Apr");
		map.put("5", "May");
		map.put("6", "Jun");
		
		// First way --> Iterator
		// not recommended
		Iterator<Entry<String,String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String,String> entry = (Map.Entry<String,String>) iterator.next();
			System.out.println("Key : " + entry.getKey() + " Value :" + entry.getValue());
		}
		
		// Second Way : recommended
		for (Map.Entry<String, String> entry : map.entrySet()){
			System.out.println("Key : " + entry.getKey() + " Value :" + entry.getValue());
		}
		
		//Java 8 only, forEach and Lambda. recommend!
		System.out.println("\nExample 4...");
		map.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));


	}

}
