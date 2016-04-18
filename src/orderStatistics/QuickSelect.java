package orderStatistics;

import java.util.Arrays;

public class QuickSelect {
	
	static int[] A = {2,6,12,1,4,9,3};
	
	public static int partition(int l,int r){
		
		int t = l-1;
		int pivot = A[r];
		
		for(int i=l;i<=r-1;i++){
			if(A[i]<pivot){
				t = t+1;
				int temp = A[i];
				A[i] = A[t];
				A[t] = temp;
			}
		}
		int temp = A[r];
		A[r] = A[t+1];
		A[t+1] = temp;
		return t+1;
	}
	
	public static int quickSelect(int l,int r,int n){
	if(l==r){
//		System.out.println(n + "th smallest element is " + A[l]);
		return A[l];
	}	
	else{
		int m = partition(l,r);
		System.out.println(m);
		for(int i = l;i<r+1;i++){
			System.out.print(A[i]+"\t");
		}
		int k = m-l+1;
		System.out.println("\nK is : "+ k);
		if (n==k){
			//System.out.println(n + " th smallest element is "+ A[k]);
			return A[m];
		}
		else if(n < k)
			return quickSelect(l,m-1,n);
		else
			return quickSelect(m+1,r,n-k);
	}		
}
	
	public static void main(String[] args){

		 
		int l = 0;
		int r = A.length-1;
		int n = 4;
		int e = quickSelect(l,r,n);	
		System.out.println(n + "th Smallest Element is : " + e);
	}

}
