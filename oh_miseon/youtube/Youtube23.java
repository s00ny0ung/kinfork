
// print reverseStr
// input : ADEFH
// output : HFEDA

import java.util.*;

class Youtube23 {

	public static void main(String[] args){
	
		String checkStr = new Scanner(System.in).next();
		
		String reverseStr = new StringBuffer(checkStr).reverse().toString();
		System.out.println(reverseStr);
		
		/*
		강의 정답.
		String n = "ADEFH";
		
		char str[] = n.toCharArray();
		char tmp;
		
		int len = str.length;
		
		for(int i=0; i<len/2; i++){
			
			tmp = str[i];
			str[i] = str[len-i-1];
			str[len-i-1] = tmp;
		}
		n = new String(str);
		System.out.println(n);
		
		*/
	}
}