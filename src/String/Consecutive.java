package String;

import java.util.HashMap;

public class Consecutive {
	
	public static void cons(String str){
		
		char [] s = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		for (int i=0;i<s.length;i++){
			if (map.containsKey(s[i])){
				map.put(s[i], map.get(s[i])+1);
			}else{
				map.put(s[i], 1);
			}
		}
		
		
	}

	
	public static void main (String [] args){
		cons("aabccda");
	}
}
