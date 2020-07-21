package youtube;

import java.util.Scanner;

public class you08 {

	int sum=1;
	
	public int solution(int n) {		
		for(int i = 1; i <= n; i++) {
			sum = sum * i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		you08 y = new you08();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(y.solution(n));
	}

}

/*
2! = 2 1
3! = 3 2 1 =6
4! = 4 3 2 1 = 24
5! = 5 4 3 2 1 = 120
*/