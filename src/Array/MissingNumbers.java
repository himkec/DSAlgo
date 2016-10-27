package Array;

public class MissingNumbers {
	
	public static void missNumber(int [] a){
		int num = a[0];
		int length = a.length;
		int i=0;
		while (i<length){
			if (a[i] == num){
				i++;
				num++;
			}
			else{
				System.out.print(num + " ");
				num++;
			}
		}
	}
	
	public static void main(String [] args){
		int [] a ={1,2,3,6,7,9,12};
		missNumber(a);
	}
}
