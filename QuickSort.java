package com.QuickSort.ankan;
import java.util.Scanner;

public class QuickSort 
{
	public int Partition(int A[], int start ,int end){
		int temp;
		int pivot = A[end];
		int partitionIndex = start;
		for(int i=start; i<end; i++)
		{
			if(A[i]<=pivot){
				temp = A[i];
				A[i] = A[partitionIndex];
				A[partitionIndex] = temp;
				partitionIndex++;
			
			}
		}
		temp = A[end];
		A[end] = A[partitionIndex];
		A[partitionIndex] = temp;
		return partitionIndex;
	}
  
	public void qSort(int A[], int start, int end){
		if(start<end) {
			int partitionIndex = Partition(A, start, end);
			qSort(A, start, partitionIndex -1);
			qSort(A, partitionIndex+1, end);
		    }
	    }
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of Elemenets: ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Elements:");

		for(int i=0; i<n; i++){
			arr[i] = s.nextInt();
		}

		QuickSort ob = new QuickSort();
		ob.qSort(arr, 0, n-1);

		for(int i: arr){
			
			System.out.println(i);
			}
		s.close();
	}
}
