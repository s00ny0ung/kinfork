import java.util.*;

//https://app.codility.com/demo/results/trainingKHYHX7-BNW/
class OddOccurrencesInArray {
    public int solution(int[] A) {
        // {9,3,9,3,9,7,9}
        // return 7;
        
        Set<Integer> set = new HashSet<Integer>();
        
        for(int value : A){
            
            if(set.contains(value)){
                set.remove(value);
            }else{
                set.add(value);
            }
        }
        
        return set.iterator().next();
    }
	
	public static void main(String[] args){
	
		OddOccurrencesInArray oddArray = new OddOccurrencesInArray();
		System.out.println(oddArray.solution({9,3,9,3,9,7,9});
	}
}


