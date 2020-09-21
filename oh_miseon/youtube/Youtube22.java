
/*/22
12321 TRUE
*/

import java.util.*;

class Youtube22 {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		String parseNum = String.valueOf(num);
		String reverseStr = new StringBuffer(parseNum).reverse().toString();
		
		if(parseNum.equals(reverseStr)){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
		
		/*
			강의정답.
			
			String n = "12321";
			int len = n.length();
			boolean flag = true;
			
			for(int i=0; i<len/2;i++){
				if(n.charAt(i) != n.charAt(len-i-1)){
					flag = false;
				}
			}
			
			System.out.println(flag);
		*/
		
	}
}