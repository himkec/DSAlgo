package HashSet;

import java.util.HashSet;

/* 
 * HashSet stores elements in sorted order and duplicates are not allowed
 * 
 * 
 * 
 */
public class HashSetTest {
	
	public static void main(String args[]) {
	      // create a hash set
	      HashSet<String> hs = new HashSet<String>();
	      
	      // add elements to the hash set
	      hs.add("Bad");
	      hs.add("A");
	      hs.add("D");
	      hs.add("E");
	      hs.add("C");
	      hs.add("Bf");
	      hs.add("F");
	      
	      hs.contains("A");
	      System.out.println(hs.contains("A"));
	   }

}
