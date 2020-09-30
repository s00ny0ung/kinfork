/*
 * 별출력
 * 입력(5)
 * 
 * *****
 *  ****
 *   ***
 *    **
 *     *
 */
package youtube;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class you17 {

	public void solution(int n) {
		for(int i = 0; i <= n; i++) { //행 1
			for(int j = 0; j < n; j++) { //열
				if(i > j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		you17 s = new you17();
        s.solution(num);
	}

}
