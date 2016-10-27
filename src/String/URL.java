package String;

import java.util.ArrayList;
import java.util.List;

public class URL {
	
	public static List<String> URLfy(String s){
		
		char [] str = s.toCharArray();
		String ans="";
		List<String> word = new ArrayList<String>();
		
		for (int i = 0;i<str.length;i++){
			if (str[i]!=' '){
				ans=ans+str[i];
			}
			else{
				word.add(ans);
				ans="";
			}
			if(i==str.length-1){
				word.add(ans);
			}
		}
		
		return word;
	}
	
	public static void main(String [] args){
		String s = "Hi How are you";
		String output="";
		for (String test : URLfy(s))
		{
			output=output+test+"%20";
		}
		System.out.println(output);
	}

}
