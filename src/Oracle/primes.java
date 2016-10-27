package Oracle;

public class primes {
	
	/*
	 * Logic : Prime number is only divisible by 1 or itself
	 * 
	 */
	
	public static void prime(){
	   for (int i = 2; i <= 100; i++) {
		   if (isPrime(i)){
			   System.out.print(i + " ");
		   }
	   }
	       
	}
	
	public static boolean isPrime(int num){
		for (int i=2;i< num/2 +1 ; i++){
			if (num%i==0){
				return false;
			}
		}
		return true;
	}
	
	
	public static void main (String [] args){
		prime();
	}

}
