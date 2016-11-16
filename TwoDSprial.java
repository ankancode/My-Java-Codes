import java.util.Scanner;
public class TwoDSprial {
    
	public void printSpiral(int A[][], int rs, int c){
		int t=0, b = rs-1, l = 0, r = c-1;
		int dir = 0, k;
		while(t<=b && l<=r)
		{
			if(dir == 0){
				for(k=l; k<=r; k++){
					System.out.print(A[t][k] +" ");
				}
				t++;
			}
			else if(dir == 1){
				for(k=t; k<=b; k++){
					System.out.print(A[k][r] +" ");
				}
				r--;
			}
			else if(dir == 2){
				for(k=r; k>=l; k--){ 
					System.out.print(A[b][k] +" ");
				}
				b--;
			}
			else if(dir == 3){
				for(k=b; k>=t; k--){
					System.out.print(A[k][l] +" ");
				}
				l++;
			}
			
			dir = (dir+1) % 4;
		}
		
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the dimensions of the array: ");
		System.out.println("Rows: ");
		int rs = s.nextInt();
		System.out.println("Columns: ");
		int c = s.nextInt();
		
		int A[][] = new int[rs][c];
		
		for(int i=0; i<=rs-1; i++){
			for(int j=0; j<=c-1; j++){
				A[i][j] = s.nextInt();
			}
			System.out.println();
		}
		
		TwoDSprial ob = new TwoDSprial();
		ob.printSpiral(A, rs, c);
		
	}

}
