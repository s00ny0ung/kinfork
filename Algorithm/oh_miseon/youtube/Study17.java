import java.util.*;

class Study17 {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("input the numbers : " );
		int n = scanner.nextInt();
		
		for(int i=n; i>0; i--){
			int j=i;
			if(j<n){
				int k = (n-j);
				while(k>0){
					System.out.print(" ");
					k--;
				}
			}
			while(j>0){
				System.out.print("*");
				j--;
			}
			System.out.println();
		}		
	}	
}