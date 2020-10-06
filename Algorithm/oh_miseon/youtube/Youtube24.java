
// print avg
// input : 7 100 95 90 80 70 60 50
// output : 57.143%
import java.util.*;

/*
	javac Youtube24.java -encoding UTF-8
	평균보다 점수가 넘은 학생들의 비율.
*/
class Youtube24 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of students");
		int students = sc.nextInt();
		int[] scores = new int[students];
		
		int sum = 0;
		for(int i=0; i<students; i++){
			scores[i] = sc.nextInt();
			sum += scores[i];
		}

		double avg = (sum/students);
		
		double count = 0;
		for(int score : scores){
			
			if(avg < score){
				count++;
			}
		}
		
		System.out.println((count/students)*100 + "%");
	}
}