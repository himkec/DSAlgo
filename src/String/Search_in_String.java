package String;

public class Search_in_String {
	public static void brute_force(String text, String pattern) 
	{
	  // let n be the size of the text and m the size of the
	  // pattern
		char[] txt = text.toCharArray();
		char[] pat = pattern.toCharArray();
		int j;
		
		int n = text.length();
		int m= pattern.length();
	  for(int i = 0; i < n; i++) {
	    for( j = 0; j < m && i + j < n; j++) 
	      if(txt[i + j] != pat[j]) break;
	      // mismatch found, break the inner loop
	    if(j == m) 
	    	System.out.println("Match found");// match found
	  }
	}
	
	public static void main(String [] args){
		String pat= "elli";
		String txt = "Hello";
		
		brute_force(txt,pat);
		
	}
}
