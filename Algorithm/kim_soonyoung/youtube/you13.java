/*
 * 12번 숫자 사각형3
 * 입력된 수(n) 만큼 n행 n열의 형태 출력
 * 1 2 3 4
 * 2 4 6 8
 * 3 6 9 12
 * 4 8 12 16
 * 
 * 중첩 반복문(for문 while)
 * 조건문(if)
 * 배열
 */

package youtube;

import java.util.Scanner;

public class you13 {

	public void solution(int n) {
		int[][] arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = (i+1)*(j+1);
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		you13 y = new you13();
		y.solution(n);
	}

}
