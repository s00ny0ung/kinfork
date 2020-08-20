import java.util.*;

public class Youtube19 {
	/*
	 n^m 
	 5^3
	 = 5*5*5 = 125
	*/
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input the n : ");
		int n = scanner.nextInt();
		
		System.out.print("Input the m : ");
		int m = scanner.nextInt();
		
		int result = 1;
		for(int i=1; i<=m; i++){
			result *= n;
		}
		
		System.out.print("result : " + result);
	}
}