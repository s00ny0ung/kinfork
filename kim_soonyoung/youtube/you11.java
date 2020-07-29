/*
 * 11번 숫자 사각형2
 * 입력된 수(n) 만큼 n행 n열의 형태 출력
 * 1 2 3 4
 * 8 7 6 5 
 * 9 10 11 12
 * 16 15 14 13
 * 
 * 중첩 반복문(for문 while)
 * 조건문(if)
 * 배열
 */

package youtube;

import java.util.Scanner;

public class you11 {
	
	public void solution(int n) {
		int[][] arr = new int[n][n];
		int num = 1;
		
		for(int i = 0; i < n; i++) {
			if(i%2 == 0) {
				for(int j = 0; j < n; j++) {
					arr[i][j] = num;
					num++;
				}
			}else {
				for(int j = n-1; j >= 0; j--) {
					arr[i][j] = num;
					num++;
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j =0;j<n;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		you11 y = new you11();
		y.solution(n);
	}

}
