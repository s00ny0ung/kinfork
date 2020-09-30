package com.nbp.test;

public class Test2 {
	public int solution(int inner, int outer, int[] points_x, int[] points_y) {
		int answer = 0;
		int r = outer/2;
		
		for(int i=0; i<points_x.length; i++) {
			/*
			 * x = 원의 중심이 될 x좌표 + cos(각도) * 반지름 
			 * y = 원의 중심이 될 y좌표 + sin(각도) * 반지름
			 */

			int x = points_x[i];
			int y = points_y[i];
			
			if(0 < x) {
				if(x <= inner) {
					if(y > 0) {
						if(inner < y && y < outer) {
							System.out.println(x + " " + y);
							answer++;
						}		
					}else {
						if((-1*outer) < y &&  y<(-1*inner)) {
							answer++;
						}
					}
				}else {
					
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		int[] points_x = {4,0,1,-2};
		int[] points_y = {-4,4,3,0};
		
		System.out.println(new Test2().solution(2, 4, points_x, points_y));
	}
}
