package com.test.programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/64061
 * 카카오 인형뽑기
 * 사라진 인형의 개수를 찾아롸
 */
public class CraneDoll {

	public static void main(String[] args) {

		
		/*public int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        return answer;
	    }*/
		// N*N 행렬
		// moves만큼 움직였을때 같은 값은 사라짐.

		/*
		
		int[][] board = {
							 {0,0,0,0,0},
							 {0,0,1,0,3},
							 {0,2,5,0,1},
							 {4,2,4,4,2},
							 {3,5,1,3,1}
						 };
		int[] moves = {1,5,3,5,1,2,1,4};
		List<Stack<Integer>> stackList = new ArrayList<Stack<Integer>>();
		
		// stack 초기화
		int idx = 0;
		for(int i=board.length; i > 0; i--) {
			
			Stack<Integer> stack = new Stack<Integer>();
			stackList.add(stack);
			
			for(int j=board.length-1; j>=0; j--) {
				if(board[j][idx] != 0) {
					stack.add(board[j][idx]);
				}
			}
			idx++;
		}
		
		Stack<Integer> basket = new Stack<Integer>();

		int count = 0;
		
		for(int move : moves) {
			
			Stack<Integer> line = stackList.get(move-1);
			if(!line.isEmpty()) {
				int doll = line.peek();
				
				if(basket.isEmpty()) {
					basket.add(doll);
				}else {
					if(basket.peek() == doll) {
						// 넣은 인형이 같으면 사라짐
						count ++;
						basket.pop();
					}else {
						basket.add(doll);
					}
				}
				line.pop();
			}
		}
		*/

		int[][] board = {
							 {0,0,0,0,0},
							 {0,0,1,0,3},
							 {0,2,5,0,1},
							 {4,2,4,4,2},
							 {3,5,1,3,1}
						 };
		int[] moves = {1,5,3,5,1,2,1,4};
		
		int answer = 0;
		Stack<Integer> basket = new Stack<Integer>();
		for(int move : moves) {
			
			for(int i=0; i<board.length; i++) {
				
				if(board[i][move-1] != 0) {
					if(basket.isEmpty()) {
						basket.add(board[i][move-1]);
					}else {
						if(basket.peek() == board[i][move-1]) {
							basket.pop();
							answer ++;
						}else {
							basket.add(board[i][move-1]);
						}
					}
					board[i][move-1] = 0;
					break;
				}
			}
		}
		
		System.out.println(answer*2);
	}

}
