
import java.util.HashMap;
import java.util.Map;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42578
 * 
 * 위장
 * 201118
 */
public class Camouflage {
	public static void main(String[] args) {
		
		//의상 이름, 의상 종류.
		//String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

		/* 4종류의 옷이 {n,m,o,p}개의 옷이 있을때  
		 * (n+1) * (m+1) * (o+1) * (p+1) -1
		 * 각 종류의 옷을 입거나, 말거나 두가지의 선택지가 있다. 
		 * 옷을 고르는것은 동시에 일어나는 일이여서 *기.
		 * 모든옷을 안입는 경우는 없기 때문에 -1,
		 * +1을 해주는 이유는 안고르는 경우의 수도 추가해주기 위해서.
		 */
		
		Map<String, Integer> clothesInfo = new HashMap<String, Integer>();
		
		for(int i=0; i < clothes.length; i++){
			clothesInfo.put(clothes[i][1], clothesInfo.getOrDefault(clothes[i][1], 0) + 1);
		}
		
		int answer =1;
		
		for(int value : clothesInfo.values()){
			answer *= (value+1);
		}
		
		System.out.println("정답 : " + (answer -1));
	}

}