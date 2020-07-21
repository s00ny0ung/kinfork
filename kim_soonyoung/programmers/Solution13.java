/*
 * 자릿수 더하기
 * N의 각 자릿수의 합을 구해서 return 하는 solution 함수
 * 예를들어 N = 123이면 1 + 2 + 3 = 6
 */

package programmers;

import java.util.Scanner;

public class Solution13 {

	public int solution(int n) {
        int answer = 0;
        
        while(n>0) {
        	answer += n%10;
        	n = n/10;
        }
        
        return answer;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Solution13 s = new Solution13();
		System.out.println(s.solution(n));
	}

}
