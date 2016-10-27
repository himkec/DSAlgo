package String;

public class Edits {

	int len1, len2;

	public boolean edits(String str1, String str2) {

		len1 = str1.length();
		len2 = str2.length();

		if (checkInsert(str1, str2)) {
			return true;
		} else if (checkInsert(str2, str1)) {
			return true;
		} else if (checkReplace(str1, str2)) {
			return true;
		} else
			return false;

	}
	
	/*
	 * check all the characters, there should be only one mismatch
	 * 
	 */
	boolean checkInsert(String s1, String s2) {
		if (s1.length() == s2.length() + 1) {
			int index1 = 0;
			int index2 = 0;
			boolean firstdDiff = false;
			while (index1 < len1 && index2 < index2) {
				if (s1.charAt(index1) != s2.charAt(index2)) {
					if (firstdDiff) {
						return false;
					}
					index1++;
					firstdDiff = true;
				} else {
					index1++;
					index2++;
				}
			}
			return true;
		} else
			return false;
	}
	/*
	 * check all the characters, there should be only one mismatch
	 * 
	 * 
	 */
	
	boolean checkReplace(String s1, String s2) {
		boolean firstdDiff = false;
		if (len1 == len2) {
			for (int i = 0; i < len1; i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					if (firstdDiff) {
						return false;
					}
				}
				firstdDiff = true;
			}
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		Edits ed = new Edits();
		System.out.println(ed.edits("acd", "abcd"));
	}
}
