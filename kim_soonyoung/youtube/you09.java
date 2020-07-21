/*
 * 입력된 수의 각 자릿수 합을 구하시오
 * 1242
 * 1+2+4+2 = 9 
 */

package youtube;

import java.util.Scanner;

public class you09 {
	
	public int solution(int n) {
		int sum=0;
		
		while(n>0) {
			sum += n % 10;
			n = n/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		you09 y = new you09();
		System.out.println(y.solution(n));
	}

}
