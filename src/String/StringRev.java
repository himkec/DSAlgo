package String;

public class StringRev {
	
	public static void strRev(String s){
		String rev="";
		char[] st= s.toCharArray();
		
		for (int i=st.length-1;i>=0;i--){
			rev = rev+st[i];
		}
		System.out.println(rev);
		
	}
	
	public static void main(String [] args){
		strRev("Hello hI How r you");
	}

}
