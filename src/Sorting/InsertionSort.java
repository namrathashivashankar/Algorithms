package sorting;

import java.util.Scanner;

/*Start with an empty sorted array,pick an element and place in a right place */

public class InsertionSort {
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
		
		for(int i=1;i<n;i++){
			int key = ele[i];
			for(int j=i-1;j>=0;j--){
				if(key < ele[j]){
				    ele[j+1] = ele[j];
					ele[j] =key;
				}
			}
		}
		
System.out.println("Sorted List is ");
		
		for(int i=0;i<n;i++){
			System.out.print(ele[i]+ "\t");
		}
		
	}

}
