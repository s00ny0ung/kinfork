/*
 * 정수 내림차순으로 배치하기
 * 
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. 
 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 * 
 */

package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution17 {
	
	public long solution(long n) {
        long answer = 0;
        String a = Long.toString(n);
        
        Integer[] arr = new Integer[a.length()];
        
        for(int i = 0; i < arr.length ; i++) {
        	arr[i] = (int) (n % 10);
        	n = n / 10;
        }
        
       Arrays.sort(arr, Collections.reverseOrder()); //wrapper변수를 사용해야 한다.
       for(int i = 0; i < arr.length; i++) {
    	   //answer += a[i];
    	   System.out.print(arr[i]);
       }
       
       for (int i = 0; i < arr.length; i++) {
    	   answer += arr[i];
    	   answer *= 10;
       }
       answer /= 10;

       return answer;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		Solution17 s = new Solution17();
		//System.out.println(s.solution(n));
		
		s.solution(n);
	}

}
