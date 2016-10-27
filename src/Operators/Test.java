package Operators;

import java.util.Scanner;

public class Test {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int a0 = 5;
	        int a1 = 6;
	        int a2 = 7;
	        int b0 = 3;
	        int b1 = 6;
	        int b2 = 10;
	        int aliceCount = 0;
	        int bobCount = 0;
	        for (int i=0;i<3;i++){
	        	
	            if(('a'+i) > ('b'+i)){
	                aliceCount++;
	            }
	            else if (('a'+i) < ('b'+i)){
	                bobCount++;
	            }
	        }
	        
	        System.out.print(aliceCount +" "+bobCount );
	    }
}
