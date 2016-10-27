package Array;

public class ProductAllExceptitSelf {
	
	public void productAll(int a[]){
		
		int n = a.length;
		
		int left[] = new int[n];
		
		int right[] = new int[n];
		
		int prod[] = new int[n];
		
		// 1 for first element a[0] left will be 1
		left[0]=1;
		// 1 for last element a[n-1] right will be 1
		right[n-1]=1;
		
		for (int i=1;i<n;i++){
			left[i]= left[i-1]*a[i-1];	
		}
		
		for (int j=n-2 ; j>=0;j--){
			right[j]=right[j+1]*a[j+1];
		}
		
		for (int i=0;i<n;i++){
			prod[i]=left[i]*right[i];
		}
		
		
	}

}
