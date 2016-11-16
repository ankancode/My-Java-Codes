import java.util.Scanner;
public class MaxSubArray {
	
	public int findSubArray(int A[], int n){
		int min = Integer.MIN_VALUE, sum=0, ans=0;
		boolean flag = false;
		for(int i=0; i<n; i++){
			
			if(A[i]<0){
				if(A[i]>min)
					min = A[i];
			}
			else
				flag = true;
			
			if(flag == true)
			{
				if((sum+A[i])>=0)
					sum = sum + A[i];
				if(A[i] >= sum && A[i] >= ans){
					ans = A[i];
					sum = A[i];
				}
				else if(sum >= A[i] && sum >= ans)
				ans = sum;	
			}
		}
		
		if(flag == true){
			
			return ans;
			
		}
		else
		{
     		return min;
		}
		
	}

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = s.nextInt();
		int A[] = new int[n];
		
		for(int i =0; i<n; i++)
		{
			A[i] = s.nextInt();
		}
		
		MaxSubArray ob = new MaxSubArray();
		
		int maxSum = ob.findSubArray(A, n);
		
		System.out.printf("Max Sum SubArray: %d ", maxSum);

	}

}
