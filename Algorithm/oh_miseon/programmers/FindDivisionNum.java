package com.test.programmers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *https://programmers.co.kr/learn/courses/30/lessons/12910
 *	arr	divisor	return
	[5, 9, 7, 10]	5	[5, 10]
	[2, 36, 1, 3]	1	[1, 2, 3, 36]
	[3,2,6]	10	[-1]
 */
public class FindDivisionNum {

	public static void main(String[] args) {
		
		/*
		 * public int[] solution(int[] arr, int divisor) {
		        int[] answer = {};
		        return answer;
		    }
		 * */
		
		int[] answer = {-1};
		
		List<Integer> list = new ArrayList<Integer>();
		
		int[] arr = {5,9,7,10};
		int divisor = 5;
		
		for(int checkVal : arr) {
			if(checkVal % divisor == 0) {
				list.add(checkVal);
			}
		}
		
		if(list.size() > 0) {
			answer = list.stream().sorted().mapToInt(i -> i).toArray();
		}
		
	}
}
