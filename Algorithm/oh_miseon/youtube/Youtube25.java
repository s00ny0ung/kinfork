import java.util.*;

/*
	javac Youtube24.java -encoding UTF-8
	N이 주어졌을 떄 N의 사이클의 길이를 구하시오(1<=N <= 100)
	
	26
	2+6=8 -> 68 
	6+8=14->84 
	8+4=12 -> 42 
	4+2=6 26
	= 4번
	
*/
class Youtube25 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int num = sc.nextInt();
		
		int tempNum = num;
		int temp = 0;
		do{
			temp = tempNum/10 + tempNum %10;
			tempNum = tempNum%10 * 10 + (temp %10);
			count++;
		}while(tempNum!=num);
		
		System.out.println(count);
	}
}