package String;

public class Unique {
	public static boolean checkForUnique(String str){
	    boolean containsUnique = false;

	    for(char c : str.toCharArray()){
	    	// indexOf returns the first index of char in String
	    	// lastIndexOf returns the last index of char in String
	        if(str.indexOf(c) == str.lastIndexOf(c)){
	            containsUnique = true;
	        } else {
	            containsUnique = false;
	        }
	    }

	    return containsUnique;
	}
	
	public static void main(String [] args){
		System.out.println(checkForUnique("abcdfrG1"));
	}
}
