package com.programmers;

import java.util.Arrays;

public class FindMinMaxNum {

	public String solution(String s) {

		/*
		String answer = "";

		String[] arr = s.split(" ");
		int[] list = new int[arr.length];

		for(int i=0; i<arr.length; i++) {
			list[i] = Integer.valueOf(arr[i]);
		}
		
		//Arrays.sort(list);
		//answer = list[0] + " " + list[list.length-1];
		
		// 다른 사람 풀이
		answer = Arrays.stream(list).min().getAsInt() + " " + Arrays.stream(list).max().getAsInt();
		//         return Arrays.stream(arr).min().orElse(0) + " " + Arrays.stream(arr).max().orElse(0);
		return answer;
		*/
		
		String[] tmp = s.split(" ");
		int min, max, n;
		min = max = Integer.parseInt(tmp[0]);
		for (int i = 1; i < tmp.length; i++) {
			n = Integer.parseInt(tmp[i]);
			if (min > n)
				min = n;
			if (max < n)
				max = n;
		}

		return min + " " + max;

	}

	public static void main(String[] args) {

		FindMinMaxNum findNum = new FindMinMaxNum();
		System.out.println(findNum.solution("-1 -2 -3 -4"));
	}

}
