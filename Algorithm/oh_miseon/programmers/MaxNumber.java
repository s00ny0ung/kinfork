package com.test.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42746
 *
 */
public class MaxNumber {

	public static void main(String[] args) {

			/*
			 *  public String solution(int[] numbers) {
			        String answer = "";
			        return answer;
			    }
			 * 
			 * */
		
		
		int[] numbers = {3, 30, 34, 5, 9};
		// 0 또는 양의 정수가 담긴 배열.
		
		// 큰것부터 
		Map<Integer, List<Integer>> sortedMap = new TreeMap<Integer, List<Integer>>(Collections.reverseOrder());
		
		for(int number : numbers) {
			int namege = number % 10;
			List<Integer> list = sortedMap.get(namege);
			if(list == null) {
				list = new ArrayList<Integer>();
				sortedMap.put(namege, list);
			}
			list.add(number);
		}
		
		String answer = "";
		for(int namege : sortedMap.keySet()) {
			sortedMap.get(namege).sort(new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					if(o1 > 02) {
						return -1;
					}else {
						return 1;
					}
				}
			});
			
			/*for(int value : sortedMap.get(namege)) {
				answer += value +"";
			}*/
		}
		
		for(List<Integer> value : sortedMap.values()) {
			for(int v : value) {
				answer += v +"";
			}
		}
		System.out.println(answer);
		
	}

}
