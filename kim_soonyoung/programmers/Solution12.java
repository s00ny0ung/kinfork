/*
 * 정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, solution을 완성해주세요.
 */
package programmers;

import java.util.Scanner;

public class Solution12 {
	
	public String solution(int num) {
        
		String answer = "";
		
        if(num %2 ==0 || num ==0) {
        	answer +="Even";
        }else {
        	answer += "Odd";
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		Solution12 s = new Solution12();
		System.out.println(s.solution(num));
	}

}
