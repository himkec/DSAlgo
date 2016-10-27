package String;

public class ReverseWorlds {
	
		public static char[] getReverseWord(String s) {
			char[] str = s.toCharArray();
	        
	        int n = str.length;
	        for (int i = 0; i < n; i++) {
	 
	            // strip white space
	           /* while (i < n && str[i] == ' ') {
	                i++;
	            }
	            int wordStart = i;
	            while (i < n && str[i] != ' ') {
	                i++;
	            }*/
	        	int wordStart = i;
	            if (wordStart < n) {
	                reverse(str, wordStart, i - 1);
	            }
	        }
	        reverse(str, 0, n - 1);
	        return str;
	}
		public static void reverse(char[] str, int l, int r) {
			 
	        while (l < r) {
	            char t = str[l];
	            str[l] = str[r];
	            str[r] = t;
	            l++;
	            r--;
	        }
	    }
		
		public static void main(String [] args){
			System.out.println(getReverseWord("hi how are"));
		}

}
