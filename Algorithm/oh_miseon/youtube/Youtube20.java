import java.util.*;

public class Youtube20 {
	
	/*
		369 GAME
		~100
	*/
	public static void main(String[] args){
		
		for(int i=1; i<=100; i++) {
			
			String[] arr = String.valueOf(i).split("");

			StringBuilder tempStr = new StringBuilder();
			
			for(String checkStr : arr) {
				if(checkStr.contains("3") || checkStr.contains("6") || checkStr.contains("9")) {
					tempStr.append("ZZAK");				
				}
			}
			
			if(tempStr.toString().isEmpty()){
				System.out.print(i + " ");
			}else{
				System.out.print(tempStr.toString() + " ");
			}
			
		}	
	}
}