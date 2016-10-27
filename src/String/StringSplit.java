package String;

// First find the count of patterns
// Create new String array with size = count +1
//

public class StringSplit {
	
	public static String[] stringSplit(String s){
		
		int patternCount =0;
		int stCount=0;
		String [] st;
		String temp="";
		char[] str=s.toCharArray();
		// finding the count of patterns
		for (int i=0;i<str.length;i++){
			if( str[i] == ' '){
				patternCount++;
			}
		}
		// Create new Array of string with pattern count + 1
		st=new String[patternCount++];
		
		for (int i=0;i<str.length;i++){
			if( str[i] == ' '){
				st[stCount]=temp;
				temp="";
				stCount++;
			}else{
				temp = temp+str[i];
			}
		}
		
		return st;
		
		
	}
	
	public static void main(String [] args){
		String [] s= stringSplit("Hi How are you");
		for (String st : s){
			System.out.println(st);
		}
	}

}
