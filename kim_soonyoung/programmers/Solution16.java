/* 
 * 문자열 다루기 기본
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수
 * 예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.
 * 
 * isStringDouble : 문자열이 숫자로만 이루어져 있는 지 확인
 * 					파라미터(인수)로 받은 문자열이 실수로 변환 될 수 있는지 여부를 확인
 * 					정수도 실수에 포함되기에, 정수인지도 판단할 수 있다.
 * 
 * Double.parseDouble()로 문자열을 실수로 변환, 에러가 발생하면 숫자가 아닌 것으로 판단(false)
 */

package programmers;

import java.util.Scanner;

public class Solution16 {
	
	public boolean solution(String s) {
        boolean answer = false;
        
        if(isStringDouble(s)) {
        	answer= true;
        }
        return answer;
    }
	
	private boolean isStringDouble(String s) {
		// TODO Auto-generated method stub
		try {
			Double.parseDouble(s); //문자열에서 double형으로 바꾸는 방법 - Double 클래스 parseDouble 메서드 사용
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		Solution16 s = new Solution16();
		System.out.println(s.solution(str));
	}

}
