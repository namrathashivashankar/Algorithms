package orderStatistics;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxMin {
	
	public static void main(String[] args){
		Scanner in1 = null,in2= null;
		int min = 0;
		int max = 0;
		int min1 = 0;
		int max1 = 0;
		int i = 0;
		int n = 0;
		Integer[] A = null;
		try{
			System.out.println("Enter the number of Elements");
			in1 = new Scanner(System.in);
			n = in1.nextInt();
			
			System.out.println("Eneter the elements in the array");
			
			A = new Integer[n];
			for(int j =0;j<n;j++){
				in2 = new Scanner(System.in);
				A[j]= in2.nextInt();
			}
			
			System.out.println("Input Array ");
			System.out.println(Arrays.deepToString(A));
			
			if(n==1){
				min = A[0];
				max = A[0];
			}else{
				min = A[0];
				max = A[1];
			
				if(A[0]>A[1]){
					min = A[1];
					max = A[0];
				}
				System.out.println(min + "   "+ max);
	
			
				for(i=0;i<(n-1)/2;i++){
					if(A[2*i+2]<A[2*i+3]){
						min1 = A[2*i+2];
						max1 = A[2*i+3];
					}else{
						min1 = A[2*i+3];
						max1 = A[2*i+2];
					}
					if(min1<min)
						min = min1;
					if(max1 > max)
						max = max1;
				}
			}
		}catch(ArrayIndexOutOfBoundsException e){
			if(A[2*i+2]< min)
				min = A[2*i+2];
			if(A[2*i+2]> max)
				max = A[2*i+2];
		
		}catch(Exception e){
		e.printStackTrace();
		}finally{
			in1.close();
		}
	
	System.out.println("Min: "+ min +"\n"+ "Max: "+ max);	
	}
}