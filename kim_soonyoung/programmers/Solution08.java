package programmers;

public class Solution08 {

	 public String solution(String s) {
	        String answer = "";
	        if(s.length() %2 ==0){
	        	answer += s.substring(s.length()/2-1, s.length()/2+1);
	        }else {
	        	answer = s.substring(s.length()/2,s.length()/2+1);
	        }
	        return answer;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution08 t = new Solution08();
		String s ="abde";
		System.out.println(t.solution(s));
	}

}