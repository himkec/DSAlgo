package Oracle;

public class price {
	
	static long calculateAmount(int[] prices) {
		 // Price of the first item
        long total_price = prices[0];
        // minimum price of the items to the left of any items
	    long minimum_price = prices[0];
        // price after discount
	    long discounted_price ;
	    
		if (prices.length > 1){
			
		    for (int i=1; i< prices.length;i++){
			if (prices[i] > minimum_price){
				discounted_price = prices[i]-minimum_price;
			}
			else{
				discounted_price=0;
			}
			total_price = total_price + discounted_price;
			if (minimum_price > prices[i]){
				minimum_price = prices[i];
			}
		}
		
	}
	
	return total_price;

    }
	
	public static void main(String [] args){
		int [] a = {1};
		long b = calculateAmount(a);
		System.out.println(b);
	}
}
