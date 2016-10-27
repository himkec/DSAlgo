package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonSubSequence {
	
	public static void LCS(String a1,String b1){
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char [] a = a1.toCharArray();
		char [] b = b1.toCharArray();
		int count=0;
		for (int i=0;i< a.length;i++){
			if(map.containsKey(a[i])){
				map.put(a[i], map.get(a[i])+1);
			}else{
				map.put(a[i], 1);
			}
		}
		
		for (int i=0;i< b.length;i++){
			if(map.containsKey(b[i])){
				System.out.print(b[i]);
				count = map.get(b[i]);
				if (count > 1){
					map.put(b[i], count--);
				}
				else{
					map.remove(b[i]);
				}
			}
		}
		
	}
	
	public static void main(String [] args){
		String a = "abcefa";
		String b = "abea";
		
		LCS(a,b);
		
	}
}
