package sorting;

import java.util.*;

/* Comparing Adjacent Elements in the input */
public class BubbleSort {
	
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
		/* BUBBLE SORT*/
		
//		for(int i = 0;i < n-1;i++){
//			for(int j = n-1;j>i;j--){
//				if(ele[j]<ele[j-1]){
//					int temp = ele[j];
//					ele[j] = ele[j-1];
//					ele[j-1] = temp;
//				}
//			}
//			
//		}
		
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1-i;j++){
				if(ele[j]>ele[j+1]){
					int temp = ele[j];
					ele[j] =ele[j+1];
					ele[j+1] = temp;
				}
				
			}
		}
		
		System.out.println("Sorted List is ");
		
		for(int i=0;i<n;i++){
			System.out.print(ele[i]+ "\t");
		}
	}
	
}
