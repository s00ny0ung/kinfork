/*
배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

 */

package programmers;

import java.util.Scanner;

public class whereK {
	int [] answer = new int []
	int [] arr2= {};
	
	public String solution(int[] arr, int i, int j, int k) {
		
		substring(arr[i],arr[j]);
	}
	
	public static void main(String[] args) {
		whereK w = new whereK();
		int[] arr = {1, 5, 2, 6, 3, 7, 4}; 
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		
		w.solution(arr,i, j,k);
	}

}
