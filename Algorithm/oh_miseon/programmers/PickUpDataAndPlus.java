package com.aim.eos.client.portal.manager;

import java.util.TreeSet;

/**
 *https://programmers.co.kr/learn/courses/30/lessons/68644
 *두개 뽑아서 더하기.
 *
 */
public class PickUpDataAndPlus {
	
	/**
	 *  테스트 1 〉	통과 (0.72ms, 52.7MB)
		테스트 2 〉	통과 (0.75ms, 53MB)
		테스트 3 〉	통과 (0.75ms, 52.5MB)
		테스트 4 〉	통과 (0.76ms, 53.6MB)
		테스트 5 〉	통과 (1.28ms, 52.3MB)
		테스트 6 〉	통과 (1.36ms, 53MB)
		테스트 7 〉	통과 (5.05ms, 53.9MB)
		테스트 8 〉	통과 (3.50ms, 52.4MB)
		테스트 9 〉	통과 (3.04ms, 52.1MB)
	 */
	public static void main(String[] args) {
		// numbers에 있는 데이터중 서로 다른 인덱스에 있는 두개의 수를 뽑아 더해서 만들수 있는 모든 수를 배열에 담기.
		
		int[] numbers = {2,1,3,4,1};
		//int[] numbers = {5,0,2,7};
		
		TreeSet<Integer> result = new TreeSet<Integer>();
		
		for(int i=0; i< numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				result.add(numbers[i]+numbers[j]);
			}
		}

		int[] answer = new int[result.size()];
		int i=0;
		for(int value : result) {
			answer[i] = value;
			System.out.print(value + " ");
		}
	}
}
