package org.ankan.binary;
import java.util.Scanner;
public class BinarySearch {
	
	public int Search(int A[], int n, int x ){
		int low = 0, high = n-1;
		int mid, result = -1;; 
		
		while (low<=high){
			mid = low + (high-low)/2;
			if( x==A[mid]){
				result = mid;
				low = mid +1;
			}
			else if(x<A[mid]){
				high = mid -1;
			}
			else{
				low = mid +1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number Elements: ");
		int n = s.nextInt();
		int A[] = new int[n];
		for(int i=0; i<n; i++){
			A[i] = s.nextInt();
		}
		System.out.println("Enter the Number to be searched: ");
		int x = s.nextInt();
		BinarySearch ob = new BinarySearch();
		int index = ob.Search(A, n, x);
		
		if(index==-1){
			System.out.println("Number doesnot exist");
		}
		else{
			System.out.printf("Number %d exit at index %d ",x,index);
		}
		
        s.close();
	}

}
