import java.util.*;

public class Youtube21 {
	
	public static void main(String[] args){
		
		List<Integer> resultList = new ArrayList<Integer>();
		
		System.out.println("if you stop program, input 0");

		Scanner scanner = new Scanner(System.in);

		while(true){
			
			int number = scanner.nextInt();

			if(number == 0){
				
				for(int result : resultList){
					System.out.print(result + " ");
				}
				break;
			}
			
			if(1 <= number && number <= 100){
				
				//if(resultList.indexOf(number) == -1){
				if(!resultList.contains(number)){			  resultList.add(number);
				}
				
			}else{				
				System.out.println("input the numbers. less than 100.");
			}
		}
	}
}