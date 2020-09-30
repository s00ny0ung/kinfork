
public class CaesarCipher {

	public String solution(String s, int n) {
		String answer = "";
		//97~122 a:z
		//65~90 : A.Z
		
		String[] arr = s.split("");
		for(String str : arr){
			if(str.equals(" ")){
				answer += str;
			}else{
				byte bytes = str.getBytes()[0];
				int sum = bytes+ n;
				if(bytes <= 90 && bytes >= 65){
					if(sum > 90){
					  answer += String.valueOf((char)((sum-90)+64));
					}else{
					  answer += String.valueOf((char)(sum));
					}
				}else{ // 97~122
					if(sum > 122){
					  answer += String.valueOf((char)((sum-122)+96));
					}else{
					  answer += String.valueOf((char)(sum));
					}
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		CaesarCipher cipher = new CaesarCipher();
		String result = cipher.solution("a B z", 4); // e F d
		System.out.println("expacted result : e F d");
		System.out.println("solution result : " + result);
	}
}