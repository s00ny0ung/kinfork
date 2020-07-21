/*
 * 최대공약수와 최소공배수
 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution
 * 배열의 맨 앞에 최대공약수, 그 다음 최소공배수를 넣어 반환하면 됩니다.
 * 두 수 3,12의 최대공약수는 3, 최소공배수는 12, [3,12]
 */

package programmers;

import java.util.Scanner;
import java.util.Arrays;

public class Solution14 {

	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = gcd(n,m); //최대공약수
        answer[1] = (n*m)/answer[0]; //최소공배수
        
        return answer;
	}
	
	public static int gcd(int p, int q) {
		if(q == 0) {
			return p;
		}
		return gcd(q, p%q);
	}
	
	public static void main(String[] args) {
		Solution14 s = new Solution14();
		System.out.println(Arrays.toString(s.solution(4, 12)));
		
	}

}
