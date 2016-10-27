package String;

import java.util.HashMap;

public class Anagrams {
	
	public static void anagramMap(String s1, String s2){
		int count;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char [] c1 = s1.toCharArray();
		for (int i=0;i< c1.length;i++){
			if(map.containsKey(c1[i])){
				map.put(c1[i],map.get(c1[i])+1);
			}else{
				map.put(c1[i], 1);
			}
		}
		
		char[] c2 = s2.toCharArray();
		for (int i=0;i< c2.length;i++){
			if(map.containsKey(c2[i])){
				count = map.get(c2[i]);
				if(count == 1){
					map.remove(c2[i]);
				}else{
					map.put(c2[i], count-1);
				}
			}
		} 
		
		System.out.println(map.size());	
	} 
	
	
	public static void main(String [] args){
		anagramMap("aabaab","baaaab");
	}

}
