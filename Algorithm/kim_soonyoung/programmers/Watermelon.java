package programmers;

public class Watermelon {
	    public String solution(int n) {
	        String  answer = "";

	        String [] word ={"¼ö","¹Ú"};
	        for(int i = 0; i < n; i++ ){
	            if(i%2 ==0){
	                answer = word[0];
	            }else{
	                 answer = word[1];
	            }
	        }
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Watermelon w = new Watermelon();
		w.solution(3);
	}

}
