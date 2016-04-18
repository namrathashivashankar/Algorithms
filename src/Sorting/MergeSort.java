package sorting;

import java.util.Scanner;

public class MergeSort {
	
	static int n;
	static int A[];
	//static int q;
	
	public static void mergeSort(int p,int r){
	
		if(p < r){
		   int q = (p+r)/2;
			System.out.println(A[q]+"   "+q);
			mergeSort(p,q);
			//System.out.println("\t"+A[p]+"\t"+A[r]+"\t q"+A[q]);
			mergeSort(q+1,r);
			merge(p,q,r);
		}
		//System.out.println(A[p]+"\t"+"\t"+A[r]);
	}
	
	public static void merge(int p,int q,int r){
		int i=p, k = p , j = q+1;
		int [] B = new int[n];
		
		while(i<=q&&j<=r){
			if(A[i]<A[j]){
				B[k++]=A[i++];
			}
			else{
				B[k++]=A[j++];
			}
		}
		while(i<=q) B[k++]= A[i++];
		while(j<=r)B[k++] = A[j++];
		for(int t=p;t<=r;t++)
			A[t]=B[t];
	
	}

	public static void main(String[] args){
		
		Scanner in=null;
		Scanner s= null;
		
		System.out.println("Enter the number of elements to Sort");
		s = new Scanner(System.in);
		n = s.nextInt();
		
		A = new int[n];
		System.out.println("Enter the Elements to Sort");
		
		for(int i =0;i<n;i++){
			in = new Scanner(System.in);
			A[i] = in.nextInt();
		}
		s.close();
		in.close();
		
		mergeSort(0,n-1);
		for(int k = 0;k<n;k++)
		System.out.print(A[k]+"\t");
		
		
	}
}
