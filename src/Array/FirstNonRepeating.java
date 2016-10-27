package Array;


import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstNonRepeating {
	
	public static void firstNonRep(char ch[]){
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		// putting the values in the Map
		for (int i=0;i< ch.length;i++){
			if(map.containsKey(ch[i])){
				map.put(ch[i], map.get(ch[i])+1);
			}else{
				map.put(ch[i], 1);
			}
		}
		
		// Iterating the map to get first non repeating value value will be 1 for first non repeating value
		for (Entry<Character, Integer> entry : map.entrySet()) {
			 
				System.out.println(entry.getKey() + "..."+entry.getValue());
				
		}
		
	}
	
	public static void main(String [] args){
		char [] a = {'a','r','r','a','y','b'};
		firstNonRep(a);
	}

}
