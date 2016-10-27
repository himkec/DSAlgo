package String;

import java.util.HashMap;

public class Isomorphic {
	public boolean isIsomorphic(String s, String t) {
        //  Return true if both the strings are null
        if(s.equals("") && t.equals("")) {
            return true;
        }
        
        //  Create a HashMap for one to one mapping
        
        HashMap<Character, Character> sToT = new HashMap<>();
        HashMap<Character, Character> tToS = new HashMap<>();
        
        //  Iterate each character
        for(int i = 0; i < s.length(); i++) {
            Character s1 = (Character) s.charAt(i);
            Character t1 = (Character) t.charAt(i);
            if(sToT.containsKey(s1) && sToT.get(s1) != t1) {
                return false;
            }
            else {
                sToT.put(s1, t1);
            }
            if(tToS.containsKey(t1) && tToS.get(t1) != s1) {
                return false;
            }
            else {
                tToS.put(t1, s1);
            }
        }
        return true;
    }
}
