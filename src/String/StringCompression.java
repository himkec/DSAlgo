package String;

public class StringCompression {
	
	public String strComp(String s){
		
		int len = s.length();
		int i = 0;
		int count = 1;
		String answer="";
		while(i<len-1){
			if(s.charAt(i)!=s.charAt(i+1)){
				answer = answer + s.charAt(i) + count;
				count=1;
				i++;
			}
			else{
				count++;
				i++;
			}
			if(i==len-1){
				answer = answer + s.charAt(i) + count;
			}
		}
		return answer;
	}
	
	public static void main(String [] args){
		StringCompression test = new StringCompression();
		System.out.println(test.strComp("aaabbccdfff"));
	}
}
