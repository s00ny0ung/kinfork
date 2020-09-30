package com.nbp.test;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
	 public int solution(int N) {
	        int answer = 0;
	        
	        if(N == 1 || N == 0){
	            return answer;
	        }
	        
	        int mok = 0;
			List<Integer> list = new ArrayList<Integer>();
			while (mok != 1) {

				mok = (N / 2);
				list.add((N % 2));

				if (mok == 1) {
					list.add(mok);
				}
				N = mok;
			}
			
	        boolean isCheck = false;
	        int count= 0;
	        for(int i=list.size()-1; i>=0; i--){
	        	System.out.print(list.get(i));
	            if(list.get(i) == 1){
	                isCheck = !isCheck;
	                
	                if(isCheck==false){
	                    answer = Math.max(answer, count);
	                    count = 0;
	                    isCheck = true;
	                }
	                continue;
	            }else{
	                if(isCheck){
	                    count++;
	                }
	            }
	        }
	        
	        return answer;
	    }
	    
	public static void main(String[] args) {
		
		 System.out.println(new BinaryGap().solution(328));
	}

}
