package com.nbp.test;

public class CyclicRotation {

	public int[] solution(int[] A, int K) {
		int[] answer = new int[A.length];
				
		for(int idx=0; idx < A.length; idx++) {
			
			int tempIdx = idx + K;
			
			while(tempIdx >= A.length) {
				tempIdx -= A.length;
			}
			answer[tempIdx] = A[idx];
		}
		
		return answer;
	}
	 
	/**
	 * k만큼 우측으로 움직이기.
	 * 
	 */
	public static void main(String[] args) {
		
		//int[] a = {3, 8, 9, 7, 6};
		//int k = 3;
		int[] a= {1, 2, 3, 4};
	    int k = 10;

		int[] answer = new CyclicRotation().solution(a, k);
		for(int ans : answer) {
			System.out.print(ans);
		}
	}

}
