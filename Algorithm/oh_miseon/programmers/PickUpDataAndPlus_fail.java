import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.apache.commons.collections4.list.TreeList;

/**
 *https://programmers.co.kr/learn/courses/30/lessons/68644
 *두개 뽑아서 더하기.
 * 시간초과 난 코드
 
 */
public class PickUpDataAndPlus {
	/*테스트 1 〉	통과 (0.99ms, 52.3MB)
	테스트 2 〉	통과 (2.69ms, 52.4MB)
	테스트 3 〉	통과 (0.86ms, 53.3MB)
	테스트 4 〉	통과 (3.04ms, 52.4MB)
	테스트 5 〉	통과 (274.94ms, 55MB)
	테스트 6 〉	실패 (시간 초과)
	테스트 7 〉	실패 (시간 초과)
	테스트 8 〉	실패 (시간 초과)
	테스트 9 〉	실패 (시간 초과)
	정확성: 55.6
	합계: 55.6 / 100.0*/
	static TreeSet<Integer> sumOfValues = new TreeSet<Integer>();
	public static void main(String[] args) {
		// numbers에 있는 데이터중 서로 다른 인덱스에 있는 두개의 수를 뽑아 더해서 만들수 있는 모든 수를 배열에 담기.
		
		//int[] numbers = {2,1,3,4,1};
		int[] numbers = {5,0,2,7};
		
		List<Integer> list = new ArrayList<>();
		for(int number : numbers) {
			list.add(number);
		}
		
		List<Integer> tempList = new ArrayList<>();
		for(int i=0; i<list.size(); i++) {
			permutation(list, tempList, list.size(), 2);
		}

		int i=0;
		int[] result = new int[sumOfValues.size()];
		for(int sum : sumOfValues) {
			result[i] = sum;
			i++;
			System.out.print(sum + " ");
		}
	}
	
	public static void permutation(List<Integer> list, List<Integer> temp, int n, int r) {
			if(r==0) {
				int sum = Math.addExact(temp.get(0), temp.get(1));
				sumOfValues.add(sum);
			}
			
			for(int i=0; i<n; i++) {
				temp.add(list.remove(i));
				permutation(list, temp, n-1, r-1);
				list.add(i, temp.remove(temp.size() - 1));
			}
	}

}
