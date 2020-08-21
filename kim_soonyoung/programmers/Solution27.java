/*
 * Summer/Winter Coding(~2018)
 * 예산
 * 매개변수 budget
 * 최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수를 완성하기
 * 최대 몇개의 부서?
 * d의 각 원소는 부서별로 신청한 금액을 나타내며, 
 * 
 * 1 <= budget은 예산 <= 10,000,000
 * 부서별 신청 금액 : 1 이상 100,000 이하의 자연수
 * 배열 d  : 부서별로 신청한 금액이 들어있는 배열
 */

package programmers;

import java.util.Arrays;

public class Solution27 {


    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        //System.out.println(Arrays.toString(d));
        
        for(int i = 0; i < d.length; i++) {
        	//System.out.println("arr : "+d[i]);
        	//System.out.println("budget : "+ budget);
        	budget -= d[i];
        	//System.out.println("budget : "+ budget);
        	if(budget < 0) {
        		break;
        	}
        	answer++;
        	//System.out.println("answer : "+ answer);        	
        	//System.out.println("-------");
        }
        
        return answer;
    }

	
	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		
		Solution27 s = new Solution27();
		System.out.println(s.solution(d, budget));
		
	}

}
