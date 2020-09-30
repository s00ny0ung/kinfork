import java.util.*;

// print *
class Study16 {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++){
			int j = 0;
			while(j<i){
				System.out.print("*");
				j++;
			}
			System.out.println();
		}
		
	}
}