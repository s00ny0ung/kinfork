
import java.util.*;

/* 
* 421314218
* 0 : 0
  1 : 3 
  2 : 2 
   ...
  9 : 0   
*/
public class Study14{

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the numbers");
		int num = scanner.nextInt();
		String[] arr = String.valueOf(num).split(""); 

		int[] numArr = new int[10];
		for(String str : arr){
			int temp = Integer.parseInt(str);
			numArr[temp] = numArr[temp]+1;
		}
		/*
			the answer of the lecture.
			int arr[] = new int[10];
			while(n > 0){
				arr[n%10]++;
				n/=10;
			}
		*/
		
		// int[] -length
		for(int i=0; i<numArr.length; i++){
			System.out.println(i + ":" + numArr[i]);
		}
	}
}