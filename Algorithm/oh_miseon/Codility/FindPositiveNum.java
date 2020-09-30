package com.nbp.test;

public class FindPositiveNum {

	public int solution(int[] A) {
		 boolean checker[] = new boolean[A.length + 1];
	        
        for(int i = 0 ; i < A.length ; i++){
            int value = A[i];
            if(value > 0 && value < checker.length){
                checker[value] = true;
            }
        }
        
        for(int i = 1 ; i < checker.length ; i++){
            if(checker[i] == false){
                return i;   
            }
        }
        
        return checker.length;
	}
	
	public static void main(String[] args) {
		int[] a = {1,3,6,4,1,2};
		//int[] a = {-1,-3};
		
		System.out.println(new FindPositiveNum().solution(a));
	}
}
