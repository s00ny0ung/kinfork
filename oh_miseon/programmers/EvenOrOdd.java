import java.util.*;

class Solution {
    public String solution(int num) {
        String answer = "";
        
		if(num%2 ==0){
			answer = "Even";
		}else{
			answer = "Odd";
		}
        
        return answer;
    }
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int answer = solution(scanner.nextInt());
		System.out.println(answer);
	}
}
