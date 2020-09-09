import java.util.*;

public class RegularPolyhedron {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] sum = new int[(n+m+1)];
		int max = 0;
		
		for(int i=1; i<=n; i++){
		
			for(int j=1; j<=m; j++){
				sum[(i+j)] +=1;
			}
		}
		
		for(int i=1; i<sum.length; i++){
			if(max < sum[i]){
				max = sum[i];
			}
		}
		
		List<Integer> answer = new ArrayList<Integer>();
		
		for(int i=1; i<sum.length; i++){
			if(sum[i] == max){
				answer.add(i);
			}
		}
		
		answer.forEach( value -> System.out.print(value + " " ));		
	}
}