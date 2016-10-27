package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapTest {
	
	public static void main (String [] args){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int [] dup = {1,2,3,4,2,7,8,4};
		
		for (int i=0;i<dup.length;i++){
			if (!map.containsKey(dup[i])){
				map.put(dup[i], 1);
				
			}else{
				map.put(dup[i], map.get(dup[i]) +1);
			}
		}
		
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1){
				System.out.println(entry.getKey() + "..."+entry.getValue());
			}
			
		}
		
	}

}
