/* 
문제 : 1026번 - 보물
길이가 N인 정수 배열 A와 B
함수 S : S = A[0]*B[0] + ... + A[N-1]*B[N-1]
S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자. 단, B에 있는 수는 재배열하면 안 된다.
S의 최솟값을 출력하는 프로그램을 작성하시오.

5
1 1 1 6 0
2 7 8 3 1
*/

package baekjoon;

public class treasure {
	int sum=0;
	static int [] A = {1, 1, 1, 6, 0};
	int [] B = {2, 7, 8, 3, 1};
	

	public int S() {
		 for(int i=0;i<A.length;i++) {
			 sum += A[i]*B[i];
			 //System.out.println(sum);
		 }
		 return sum;
	}
	
	public static void main(String[] args) {
		treasure t = new treasure();
		t.S();
		
		int temp = A[2];
		A[2] = A[4];
		A[4] = temp;
		System.out.println(A);
		
	}

}
