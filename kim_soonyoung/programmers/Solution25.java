/*
 * 2016년 
 * 2016년 a월 b일은 무슨요일인가?
 * a,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴
 * 요일 이름 : SUN,MON,TUE,WED,THU,FRI,SAT
 * 
 * 예시
 * a=5, b=24라면 5월 24일은 화요일 -> TUE 반환
 * 
 * 제한
 * 2016년은 윤년
 * 2016년 1월 1일은 금요일입니다
 * 
 * point!!
 * 1. 윤년이란?
 * - 윤년은 해당 연도를 4로 나눈 값이 0인 것을 의미한다.
 * - 그 중 100으로 나눈 값이 0인 것은 윤년에서 제외하나, 
 * - 400으로 나눈 값이 0인 것은 윤년으로 포함된다.
 * - 그 외의 나머지 연도는 평년이다.
 * 
 * 2. 실제 날짜라는 것이다.
 */

package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution25 {

	public String solution(int a, int b) {
		int year = 2016;
		String[] weeks = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
		int[] months = {31, 29, 31, 30, 31, 30 , 31, 31, 30, 31, 30, 31};
		int total = 0;
		
		for(int i = 0; i < a - 1; i++) {
			total += months[i];
		}
		
		total += b - 1;
		String answer = weeks[total % 7]; 
		
		return answer;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		Solution25 s = new Solution25();
		System.out.println(s.solution(a, b));
	}

}
