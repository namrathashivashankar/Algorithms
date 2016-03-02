package Sorting;

import java.util.*;

public class QuickSort {
	
	static int[] A;
	
	public static void main(String[] args){
		
		Scanner in=null
				;
		Scanner s = null;
				
		System.out.println("Please Enter the number of Elements to Sort");
		in = new Scanner(System.in);
		int n= in.nextInt();
		
		
		A = new int[n];
		System.out.println("Enter the Elements to Sort");
		for(int i=0;i<n;i++){
			s = new Scanner(System.in);
			A[i] = s.nextInt();
		}
		in.close();
		s.close();
		
		randomizedQuickSort(0,n-1);
		
		
		System.out.println("Sorted Elements are as follows");
		for(int i=0;i<n;i++){
			System.out.print(A[i]+"\t");
		}
		
	}
	
	public static void randomizedQuickSort(int p,int r){
		
		if(p<r){
			int q = randomizedPartition(p,r);
			randomizedQuickSort(p,q-1);
			randomizedQuickSort(q+1,r);
		}
	}
	
	public static int randomizedPartition(int p,int r){
		Random rand = new Random();
		int q = rand.nextInt((r-p)+1)+p;
		//System.out.println("q is "+q);
		int temp = A[r];
		A[r] = A[q];
		A[q] = temp;
		return partition(p,r);
	}
	
	public static int partition(int p,int r){
		int x = A[r];
		int i =p-1;
		for(int j=p;j<=r-1;j++){
			if(A[j]< x){
				i = i+1;
				int temp = A[j];
				A[j] = A[i];
				A[i] =temp;
			}
		}
		int temp = A[i+1];
		A[i+1] = A[r];
		A[r] = temp;
		return i+1;
	}
	

}
