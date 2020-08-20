package com.study.msoh;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GymClothes {
	/**
	 * @param n       2<= n <=30
	 * @param lost    1<= lost<=n
	 * @param reserve 1<= reserve <=n 
	 * 여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다. 여벌
	 *                체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다.
	 * @return
	 */
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;

		List<Integer> list = new LinkedList<Integer>();
		for (int lostStd : lost) {
			list.add(lostStd);
		}
		
		List<Integer> reserveList = new ArrayList<Integer>();
		for(int i: reserve){
		    if(list.indexOf(i) != -1){
			list.remove(list.indexOf(i));
			answer+=1;
		    }else{
			reserveList.add(i);
		    }
		}

		for (int i : reserveList) {

			int previousIdx = list.indexOf(i - 1);
			int postIdx = list.indexOf(i + 1);

			boolean isExist = false;
			if (previousIdx != -1) {
				list.remove(previousIdx);
				answer += 1;
				isExist = true;
				continue;
			}

			if (!isExist) {
				if (postIdx != -1) {
					list.remove(postIdx);
					answer += 1;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		GymClothes gymClothes = new GymClothes();
		int n = 5;
		int[] lost = { 2, 4 };
		int[] reserve = { 2, 3 }; // {1, 3, 5};
		int result = gymClothes.solution(n, lost, reserve);
		System.out.println("result : " + result);

	}

}
