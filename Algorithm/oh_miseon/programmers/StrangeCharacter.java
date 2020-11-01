package com.test.programmers;

public class StrangeCharacter {

	/**
	 * @param args
	 * https://programmers.co.kr/learn/courses/30/lessons/12930
	 * 
	 */
	public static void main(String[] args) {

		//Â¦¼ö´Â ´ë¹®ÀÚ
		// È¦¼ö´Â ¼Ò¹®ÀÚ·Î
		// ´Ü¾îº° Â¦/È¦¼ö
		
		String s = "tray hello world";

		String answer = "";
		boolean isOdd = false;
		for(String checkStr : s.split("")) {
			System.out.println(checkStr);
			if(checkStr.equals(" ") || isOdd){
				answer += checkStr.toLowerCase();
				isOdd = false;
			}else {
				answer += checkStr.toUpperCase();
				isOdd = true;
			}
		}
		
		System.out.println(answer);
	}

}
