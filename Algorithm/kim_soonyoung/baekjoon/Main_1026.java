/* 예제에서 보는거와 같이 한글, 영문, 숫자 상관없이 Arrays.sort() 만으로 오름차순 정렬이 가능하며
내림차순을 할 경우는 Collections.reverseOrder() 를 사용해 줍니다.
여기서 주의할 점은 int 같은 경우 내림차순을 해줄경우 integer로 바꿔주어야만 가능합니다.
(물론 integer타입도 Arrays.sort 사용이 가능하다.)
*/
package baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main_1026 {
	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		 
//        int n = sc.nextInt();
// 
//        int[] A = new int[n];
//        Integer [] B = new Integer[n];
// 
//        for (int i = 0; i < n; i++) {
//            A[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            B[i] = sc.nextInt();
//        }
//        
//        Arrays.sort(A);
//        Arrays.sort(B, Collections.reverseOrder()); 
// 
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            //sum += A[i] * B[n - 1 - i];
//        	sum += A[i]*B[i];
//        }
//        
//        System.out.println(sum);
//	}
 
}