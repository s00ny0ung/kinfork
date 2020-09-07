import java.util.*;

class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);
        
        for(int reqD : d){
            budget-=reqD;
            
            if(budget >= 0){
                answer +=1;
            }
        }
        return answer;
    }
	
	public static void main(String[] args){
	
		int[] d = {1,3,2,5,4};
		int total = 9;
		
		// result = 3;
		
		Budget budget = new Budget();
		System.out.println("result : " + budget.solution(d, total));
	}
}