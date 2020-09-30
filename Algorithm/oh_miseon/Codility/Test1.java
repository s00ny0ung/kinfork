package com.nbp.test;

//https://www.careercup.com/question?id=6194336212451328
public class Test1 {
	/*
	int solution(int X, int Y, int[] A) {
		int N = A.length;
		int result = -1;
		int nX = 0;
		int nY = 0;

		for (int i = 0; i < N; i++) {
			if (A[i] == X)
				nX += 1;
			else if (A[i] == Y)
				nY += 1;
			if (nX == nY)
				result = i;
		}

		return result;
	}
	*/
	
	// 최대 두줄만 추가해서 코드 수정하기.
	// 현재 코드는 테스트는 통과하지만 버그가 있음.
	
	int solution(int X, int Y, int[] A) {
		int N = A.length;
		int result = -1;
		int nX = 0;
		int nY = 0;

		for (int i = 0; i < N; i++) {
			if (A[i] == X)
				nX += 1;
			else if (A[i] == Y)
				nY += 1;
			if ((nX == 1) && (nY == 1))
				result = i;
		}

		return result;
	}

	public static void main(String[] args) {
		int[] A = { 100, 63, 1, 6, 2, 13 ,63};

		System.out.println(new Test1().solution(100, 63, A));
	}

}
