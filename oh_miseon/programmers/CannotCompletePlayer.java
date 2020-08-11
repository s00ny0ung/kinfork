import java.util.*;

public class CannotCompletePlayer {
	
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		
		/*
			Arrays.sort(participant);
			Arrays.sort(completion); 
			
			for(int i=0; i<completion.length; i++){
				if(participant[i].equals(completion[i]) == false){
					answer = participant[i];
					break;
				}
			}
			if(answer.isEmpty()){
				answer = participant[participant.length-1];
				
			}
		*/		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String partice : participant) {
			map.put(partice, map.getOrDefault(partice, 0)+1);
		}
		
		for(String complete : completion) {
			map.put(complete, map.get(complete)-1);
		}
		
		for(String key : map.keySet()){
			if(map.get(key)==1){
				answer = key;
				break;
			}
		}
				
		return answer;
	}
	
	public static void main(String[] args){
		CannotCompletePlayer player = new CannotCompletePlayer();
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		String answer = player.solution(participant, completion);
		System.out.println(answer); // vinko
	}
}