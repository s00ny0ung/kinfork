import java.util.*;

class Study12 {
	
	public static void main(String[] args){
		
		System.out.println("Input the number : ");
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int k = n * (-1) +1;
		for(int i=1; i<=n; i++){
		
			for(int j=1; j<=n; j++){
			
				System.out.printf("%4d", (j*n)+k);
			}
			System.out.println();
			k++;
		}
	}
}