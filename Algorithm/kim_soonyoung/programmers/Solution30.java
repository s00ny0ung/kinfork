/*
 * <비밀지도>
*/

package programmers;

import java.util.Scanner;

public class Solution30 {
	
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		String a = "";

		int[][] namT1 = new int[n][n];
		int[][] namT2 = new int[n][n];

		for (int i = 0; i < n; i++) { // 행
			for (int j = n - 1; j >= 0; j--) { // 열
				namT1[i][j] = arr1[i] % 2;
				namT2[i][j] = arr2[i] % 2;

				if (namT1[i][j] + namT2[i][j] >= 1) {
					a = '#' + a;
				} else {
					a = ' ' + a;
				}

				arr1[i] = (int) (arr1[i] / 2);
				arr2[i] = (int) (arr2[i] / 2);
			}
			answer[i] = a;
			a = "";
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(answer[i]+",");
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		
		Solution30 s = new Solution30();
		s.solution(n, arr1, arr2);
	}
}
