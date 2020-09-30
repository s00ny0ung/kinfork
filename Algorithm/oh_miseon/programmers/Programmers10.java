import java.util.*;

public class Programmers10 {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);
       
        int idx = 1;
        for(int i=1; i<arr.length; i++){
            int compare = arr[i];
           
            if(list.get(idx-1) != compare){
                list.add(compare);
                idx++;
            }
        }
        
        answer = new int[list.size()];        
        for(int j=0; j<list.size(); j++){
            answer[j] = list.get(j);
        }
        return answer;
    }
	
	public static void main(String[] args){
		Programmers10 programmers = new Programmers10();
		
		int[] arr = {1,1,3,3,0,1,1};
		int[] answer = programmers.solution(arr);
		
		for(int i=0; i<answer.length;i++){
			System.out.print(answer[i] + ",");
		}
	}
}