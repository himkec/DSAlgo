package DynamicProgramming;

public class CoinChanging {
	
	// Problem : I am given n denominations of the coin of values V1 < V2>V3 ... Vn where V1=1;
	// Make change for amount of money using as few coins as possible
	
	public static int total(int n, int[] v, int i) {
		if (n < 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}
		// means coins over and n>0 so no solution
		if (i == v.length && n > 0) {
			return 0;
		}
		return total(n - v[i], v, i) + total(n, v, i + 1);
	}
	
	public static void main(String [] args){
		int a [] = {1,2,3};
		int n=5;
		int i =3;
		
		System.out.println(total(n,a,i));
	}

}
