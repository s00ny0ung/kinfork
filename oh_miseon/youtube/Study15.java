import java.util.*;

/*
	gugudan
	s~f 
	input 2, 3
	2*1=2 3*1=3
	2*2=4 3*2=6
	...
	2*9=18 3*9=18
*/
public class Study15 {

	public static void main(String[] args){
	
	
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		int f = scanner.nextInt();
		
		for(int i=1; i<=9; i++){
			
			for(int j=s; j<=f; j++){
				
				System.out.printf("%2d *%2d =%3d", j,i,i*j);
			}
			System.out.println();
		}		
	}
}