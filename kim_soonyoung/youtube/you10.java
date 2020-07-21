/*
 * 숫자 사각형(1)
 * 입력된 수(n) 만큼 n행 n열의 형태로 연속적으로 출력되는 숫자 사각형을 출력하시오
 * 4
 * 1 2 3 4 
   5 6 7 8 
   9 10 11 12 
   13 14 15 16 
 */
package youtube;

import java.util.Scanner;

public class you10 {
	int num=0;
	
	public void solution(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				++num;
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		you10 y = new you10();
		y.solution(n);
	}

}
