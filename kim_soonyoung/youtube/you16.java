/*
 * 별출력
 * 입력받은 수 만큼 별 출력(5)
 * 
 * *
 * **
 * ***
 * ****
 * *****
 */
package youtube;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class you16 {
	
	public void solution(int n) {
		
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        you16 s = new you16();
        s.solution(num);
	}
}
