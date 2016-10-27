package String;

import java.util.HashMap;
import java.util.Map;

public class PalidromePermutation {
	
	public static void palindromePerm(String s){
		
		char [] c = s.toCharArray();
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		for (int i=0;i< c.length;i++){
			if(c[i] !=' '){
				if(map.containsKey(Character.toLowerCase(c[i]))){
					map.put(Character.toLowerCase(c[i]), map.get(c[i])+1);
				}else{
					map.put(Character.toLowerCase(c[i]), 1);
				}
			}
		}
		int count=1;
		for (Map.Entry<Character, Integer> entry : map.entrySet()){
			if(entry.getValue()%2!=0){
				count--;
			}
		}
		
		if(count ==0){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
	}
	
	public static void main (String [] args){
		
		String txt = "Tact coa";
		palindromePerm(txt);
	}

}
