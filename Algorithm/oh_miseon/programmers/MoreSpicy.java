import java.util.PriorityQueue;

/**
 *
 * https://programmers.co.kr/learn/courses/30/lessons/42626
 * 201118
 */
public class MoreSpicy {

	public static void main(String[] args) {

		// 스코빌 지수 
		// 섞은 스코빌 지수 = 가장 맵지않은 음식의 스코빌 지수 + (두번째로 맵지않은 스코빌 지수 *2);
		// 평균이 주어진 스코빌 지수보다 이상이어야 함.
		
		int[] scoville = {1,2,3,9,10,12};
		int K = 7;

		// 1. k 보다 작은수들을 큐에 넣는다.
		// 2. 만든 큐로 섞는다.
		// 1 2 3 
		// 5 3 
		// 13
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i : scoville){
			if(i < K){
				pq.offer(i);
			}
		}
		
		int answer = 0;
		if(pq.size() == 0){
			answer = -1;
			System.out.println("정답 : " + answer);
		}else{
			while(true){
				// peak : 값만 획득, pool 값 획득과 큐에서 제거.
				if(pq.size() == 1 && pq.peek() < K) {
					answer = -1;
					break;
				}
				
				int new_scoville = pq.poll() + (pq.poll()*2);
				pq.offer(new_scoville);
				answer ++;
				
				if(pq.peek() >= K) break;
			}
			System.out.println("정답 : " + answer);
		}
	}

}
