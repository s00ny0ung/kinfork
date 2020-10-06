package com.aim.eos.client.portal;

import java.util.LinkedList;

public class Printer {
	
	public int solution(int[] priorities, int location) {
		int answer = 0;
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		LinkedList<Boolean> flags = new LinkedList<Boolean>();

		for(int i=0; i<priorities.length; i++) {
			
			queue.add(priorities[i]);
			
			if(i==location) {
				flags.add(true);
			}else {
				flags.add(false);
			}
		}
		
		
		while(queue.size() > 0) {
			
			int compareValue = queue.peek();
			boolean flag = flags.peek();
			
			boolean isExist = false;
			for(int i=1; i< queue.size(); i++) {
				if(queue.get(i) > compareValue) {
					isExist = true;
					break;
				}
			}
			
			if(isExist) {
				
				queue.pop();
				queue.add(compareValue);
				flags.pop();
				flags.add(flag);
			}else {
				answer++;
				if(flag) {
					return answer;
				}else {
					queue.pop();
					flags.pop();
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		/*
		priorities	location	return
		[2, 1, 3, 2]	2	1
		[1, 1, 9, 1, 1, 1]	0	5
		
		 priority 
		    1~9
		    
		 0 <= location 
		*/
		int[] priorities = {2,1,3,2};
		int location = 2;
		System.out.println(new Printer().solution(priorities, location));
	}

}
