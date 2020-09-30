package com.programmers;

import java.util.*;

/*
	2<= n <= 1000000

	n	result
	10	4
	5	3

	[2,3,5,7] -> count 4
	[2,3,5] - > 3
*/
public class FindPrimeNumber {

	public int solution(int n) {
		// 11,12에서 시간초과 됨.
		/*
		 * // 모든 수를 다 돌아서 시간 복잡도가 O(N)이다.
		 * 
		 * int answer = 0;
		 * 
		 * for(int i=2; i<=n; i++) { boolean isPrime = true; for(int j=2; j<i; j++) {
		 * if(i % j == 0) { isPrime = false; break; } } if(isPrime) answer++; }
		 * 
		 * return answer;
		 */

		// 에라토스테네스의 체
		// 특정 숫자의 제곱근 까지만 약수의 여부 검증 시 O(N^1/2)의 시간 복잡도 걸림
		// 기본값 false임.
		/*boolean[] sosu = new boolean[n + 1];
		for (int i = 2; i < sosu.length; i++) {
			sosu[i] = true;
		}

		for (int i = 2; i * i <= n; i++) {
			if (sosu[i] == false)
				continue;

			for (int j = i * i; j <= n; j += i) {
				sosu[j] = false;
			}
		}

		int answer = 0;
		for (int i = 2; i <= n; i++) {
			if (sosu[i]) {
				answer++;
			}
		}*/
		// return answer;

		//방법2
		int result = 0;
		boolean[] prime = new boolean[n + 1];
		for (int i = 2; i <= n; i++)
			for (int j = 2 * i; j <= n; j += i) // 판별 배수 삭제.
				prime[j] = true;
		
		for (int i = 2; i <= n; i++)
			if (!prime[i])
				result++;
		return result;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		FindPrimeNumber findPrimeNumber = new FindPrimeNumber();

		// 10 > 4
		System.out.println("result : " + findPrimeNumber.solution(n));
	}
}