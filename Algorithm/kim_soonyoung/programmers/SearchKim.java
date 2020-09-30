/*
 * 이 문제의 시사점
 * 24line에서 if문에 비교할 때, 
 * seoul[i] == "Kim"이 아니라 seoul[i].equals("Kim")을 쓰는 이유는
 * 비교하는 해시코드 주소가 다르기 때문이다.
 * 숫자가 아닌 문자를 비교할 때는 반드시 ==이 아닌 equals를 사용해줘야한다.
 * */

package programmers;

public class SearchKim {
    
	String answer;
	
	public String solution(String[] seoul) {
		for(int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) { 
				answer = "김서방은 "+i+"에 있다"; //answer을 여기서 선언해버리면 for문이 끝나면서 사라진다. 그래서 멤버변수로 선언해주는 것이 맞다.
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String [] seoul = {"Jane", "Kim"};
		SearchKim s = new SearchKim();
		s.solution(seoul);
	}
}