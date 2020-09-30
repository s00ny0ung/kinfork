/*
 * 정수 제곱근 판별
 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, 
 * n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 * 
 * - Math.sqrt()
 * - Math.pow()
 */

package programmers;

import java.util.Scanner;

public class Solution15 {
	
	public long solution(long n) {
        long answer = -1;
        
        long num = (long)Math.sqrt(n); 
        
        if(Math.pow(num, 2) == n) {
        	answer =(long)Math.pow(num+1,2);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Solution15 s = new Solution15();
		System.out.println(s.solution(n));
		
	}
}
