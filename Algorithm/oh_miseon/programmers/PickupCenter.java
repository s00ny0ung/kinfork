package com.test.programmers;

public class PickupCenter {

	public static void main(String[] args) {

		//String s = "abcde";
		String s = "qwer";
		String answer = "";
		int idx = s.length() / 2;
		
		if((s.length() % 2) == 0) {
			answer = s.substring(idx-1, idx+1);
		}else {
			answer = s.substring(idx, idx+1);
		}
		
		System.out.println(answer);
	}

}
