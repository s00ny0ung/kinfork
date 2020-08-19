/*
 * 12번 숫자 사각형3
 * 입력된 수(n) 만큼 n행 n열의 형태 출력
 * 1 5 9 13
 * 2 6 10 14
 * 3 7 11 15
 * 4 8 12 16
 * 
 * 중첩 반복문(for문 while)
 * 조건문(if)
 * 배열
 */

package youtube;

import java.util.Scanner;

public class you12 {

	public void solution(int n) {
		int[][] arr = new int[n][n];
		int num = 1;
		
		for(int j = 0; j < n; j++) { //열
			for(int i = 0; i < n; i++) { //행
				arr[i][j] = num;
				num++;
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
		
		you12 y = new you12();
		y.solution(n);
	}

}
