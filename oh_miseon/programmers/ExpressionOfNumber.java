
public class ExpressionOfNumber {

	public int solution(int n){
		/*		
		효율성 : 1.735ms
		int answer = 0;		
		int i = 1;
		while(i <=n){
		
			int temp = 0;
			for(int j=i; j<=n; j++){
				temp +=j;
				if(temp == n){
					answer++;
					break;
				}else if(temp > n){
					break;
				}
			}
			i++;
		}		
		return answer;
		*/
		
		// 효율성 : 1.72ms
		int answer = 0;	
		for(int i=1; i<=n; i++){
			int temp = 0;
			for(int j=i; j<=n; j++){
				temp+=j;
				if(temp == n) {
					answer++;
					break;
				}else if(temp > n){
					break;
				}
			}
		}
		return answer;
		
		/*
		다른 사람 풀이 
		
		주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 개수와 같다라는 정수론 정리가 있습니다.

		효율성 : 0.11ms
		int answer = 0;
        for (int i = 1; i <= num; i += 2) {
            if (num % i == 0) {
                answer++;
            }
        }
        return answer;
		*/
	}
	
	public static void main(String[] args){
	
		ExpressionOfNumber expression = new ExpressionOfNumber();
		System.out.println(expression.solution(15));
	}
}