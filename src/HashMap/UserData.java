package HashMap;

import java.util.Random;

public class UserData {
	
	public String generateMem(){
		int leftLimitChar = 65; // letter 'A'
	    int rightLimitChar = 90; // letter 'z'
	    int leftLimitInt = 48; // letter 'A'
	    int rightLimitInt = 57; // letter 'z'
	    int targetStringLengthChar = 2;
	    int targetStringLengthInt = 8;
	    StringBuilder buffer = new StringBuilder(targetStringLengthChar);
	    StringBuilder buffer2 = new StringBuilder(targetStringLengthInt);
	    
	    for (int i = 0; i < targetStringLengthChar; i++) {
	        int randomLimitedChar = leftLimitChar + (int) (new Random().nextFloat() * (rightLimitChar - leftLimitChar));
	        buffer.append((char) randomLimitedChar);
	    }
	    
	    for (int i = 0; i < targetStringLengthInt; i++) {
	        int randomLimitedInt = leftLimitInt + (int) 
	          (new Random().nextFloat() * (rightLimitInt - leftLimitInt));
	        buffer2.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString().concat(buffer2.toString());
	 
	    System.out.println(generatedString);
	    
	    return generatedString;
	}
	
	
	
	public static void main(String [] args){
		int leftLimitChar = 65; // letter 'A'
	    int rightLimitChar = 90; // letter 'z'
	    int leftLimitInt = 48; // letter 'A'
	    int rightLimitInt = 57; // letter 'z'
	    int targetStringLengthChar = 2;
	    int targetStringLengthInt = 8;
	    StringBuilder buffer = new StringBuilder(targetStringLengthChar);
	    StringBuilder buffer2 = new StringBuilder(targetStringLengthInt);
	    
	    for (int i = 0; i < targetStringLengthChar; i++) {
	        int randomLimitedChar = leftLimitChar + (int) 
	          (new Random().nextFloat() * (rightLimitChar - leftLimitChar));
	        buffer.append((char) randomLimitedChar);
	    }
	    
	    for (int i = 0; i < targetStringLengthInt; i++) {
	        int randomLimitedInt = leftLimitInt + (int) 
	          (new Random().nextFloat() * (rightLimitInt - leftLimitInt));
	        buffer2.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString().concat(buffer2.toString());
	 
	    System.out.println(generatedString);
		
	}

}
