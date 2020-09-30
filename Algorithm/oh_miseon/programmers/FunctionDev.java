
import java.util.Map;
import java.util.TreeMap;

public class FunctionDev {

	public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        Map<Integer, Integer> tempMap = new TreeMap<Integer, Integer>();
        
        int previousDDay = 0;
        
        for(int i=0; i<progresses.length; i++) {

        	int progress = progresses[i]; // 93
        	int speed = speeds[i]; // 1
        	
        	int remainProgress = 100-progress; // 7
        	
        	int dDay = 1;
        	
        	while((dDay*speed) < remainProgress) {
        		dDay++;
        	}
        
        	if(i!=0) {
        		if(previousDDay < dDay) {
        			previousDDay = dDay;
        			tempMap.put(dDay, 1);
        		}else {
        			tempMap.put(previousDDay, tempMap.get(previousDDay)+1);
        		}
        		
        	}else {
        		previousDDay = dDay;
        		tempMap.put(dDay, 1);
        	}
        }
        
        answer = new int[tempMap.size()];
        
        int idx = 0;
        for(int tempKey : tempMap.keySet()) {
        	answer[idx] = tempMap.get(tempKey);
        	idx++;
        }
        
        return answer;
    } 
	
	public static void main(String[] args) {
		
		// progresses : 작업의 진도가 적힌 정수 배열(배포 되어야 하는 순서대로 적힘)
		// speeds : 작업의 개발 속도가 적힌 정수 배열
		// 배포는 100%일때 서비스 가능.
		// 각 배포마다 몇개의 기능이 배포되는지 return.
		
		// 첫번째 기능이 언제 배포되는지 확인
		// [95, 90, 99, 99, 80, 99], [1, 1, 1, 1, 1, 1]
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		
		int[] answerArr = new FunctionDev().solution(progresses, speeds);
		for(int answer : answerArr) {
			System.out.print(answer + " ");
		}
		
	}
}