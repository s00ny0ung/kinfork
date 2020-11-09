
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * numbers : 1 <= n <= 7;
 * numbers in (0,9)
 * 
 * input : 17
 * return 3;
 * 
 * https://programmers.co.kr/learn/courses/30/lessons/42839
 * 
 */
public class FindPrimeNumber2 {
	
	static TreeSet<Integer> sosu = new TreeSet<Integer>();
	static int count = 0;
	public int solution(String numbers) {
		
		List<Character> arr = new ArrayList<Character>();
		for(int i=0; i<numbers.length(); i++) {
			arr.add(numbers.charAt(i));
		}
		
		List<Character> result = new ArrayList<Character>();
		for(int i=0; i<numbers.length(); i++) {
			permutation(arr, result, numbers.length(), i+1);
		}
		
		return count;
	}
	
	/**
	 * @param list
	 * @param result
	 * @param n
	 * @param r
	 */
	public void permutation(List<Character> list, List<Character> result, int n, int r) {
 		if(r == 0) {
			String value = "";
			for(Character charc : result) {
				value += charc;
			}
			int checkNum = Integer.valueOf(value);
			
			if(!sosu.contains(checkNum)) {
				// check is prime number;
				if(checkPrimeNumber(checkNum)) {
					count++;
				}
			}
			
			return;
		}
		
		for(int i=0; i<n;i++) {
			result.add(list.remove(i));
			permutation(list, result, n-1, r-1);
			list.add(i, result.remove(result.size() -1)); // i번째에다가 element 넣는다.
		}
	}

	public boolean checkPrimeNumber(int num) {
		// 그냥 해보기
		if(num <= 1) {
			return false;
		}else {
			for(int i=2; i<num; i++) {
				if(num % i == 0) {
					return false;
				}
			}
		}
		
		sosu.add(num);
		
		return true;                 
	}
	
	public static void main(String[] args) {
		FindPrimeNumber2 pn = new FindPrimeNumber2();
		System.out.println(pn.solution("011")); // 011
	}
}