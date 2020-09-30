import java.util.regex.*;

class CheckStr {
    public boolean solution(String s) {
        boolean answer = true;
        
		String reg = "^[0-9]*$";
		answer = Pattern.matches(reg, s);
        
        if(answer == true){
            if(s.length() == 4 || s.length() == 6){
                answer = true;
            }else{
                answer = false;
            }    
        }
        
        /*
        if(s.length() == 4 || s.length() == 6){
		  try {
            Integer.parseInt(s);
           
			}catch(Exception ex){
				answer =false;
			}
		 }
		 else{
			answer = false;
		 }
        */
        return answer;
		
    }
	
     public static void main(String[] args) {
		CheckStr checkStr = new CheckStr();
		System.out.println(checkStr.solution("a1234"));
	}	
}
