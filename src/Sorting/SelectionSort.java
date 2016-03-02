package Sorting;

import java.util.Scanner;

/*Find the Smallest element and Swap with A[1] and repeat*/
public class SelectionSort {

	public static void main(String[] args){
		Scanner in=null;
		Scanner s= null;
		
		System.out.println("Enter the number of elements to Sort");
		s = new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.println("Enter the Elements to Sort");
        int[] ele = new int[n];
		
		for(int i =0;i<n;i++){
			in = new Scanner(System.in);
			ele[i] = in.nextInt();
		}
		
		s.close();
		in.close();
		
		for(int i = 0;i< n-1;i++){
			int k = i;
			for(int j=i+1;j<n;j++){
				if(ele[j]<ele[k]){
					k = j;
				}
			}
			int temp = ele[i];
			ele[i] = ele[k];
			ele[k] = temp;
		}
		
		System.out.println("Sorted Array");
		for(int i =0 ;i<n;i++){
			System.out.print(ele[i]+"\t");
			
		}
		
	}
}
