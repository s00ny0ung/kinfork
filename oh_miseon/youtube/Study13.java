import java.util.*;

class Study13 {
	
	public static void main(String[] args){
		
		System.out.println("Input the number : ");
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		
		for(int i=1; i<=n; i++){
			
			for(int j=1; j<=n; j++){
				
				System.out.printf("%4d", i*j);
			}
			System.out.println();
		}
	}
}