package com.CountOccurence.ankan;
import java.util.Scanner;
public class CountOccurence {
	
	public int index(int A[], int n, int x, boolean flag){
		int low = 0, high = n-1;
		int result = -1, mid;
		
		while(low<=high){
			mid = low + (high-low)/2;
			if(A[mid]==x){
				result = mid;
				if(flag){
					high = mid-1;
				}
				else{
					low = mid+1;
				}
			}
			else if(x<A[mid]){
				high = mid-1;
			}
			else{
				low = mid +1;
			}
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many in the array?  ");
		int n = s.nextInt();
		int A[] = new int[n];
		System.out.println("Enter the numbers: ");
		
		for(int i=0; i<n; i++){
			A[i]=s.nextInt();
		}
		
		System.out.println("Enter the number to counted: ");
		int x= s.nextInt();
		CountOccurence ob = new CountOccurence();
		int i1 = ob.index(A, n, x, true);
		if(i1==-1){
			System.out.printf("Occurence of %d is 0 ", x);
		}
		else
		{
			int i2 = ob.index(A, n, x, false);
			int count = i2 -i1+1;
			System.out.printf("Occurence of %d is %d ", x,count);
		}
		
		
	}

}
