/*정수 내림차순으로 배치 하기.*/
class InverseInt {

    public long solution(long n) {
        long answer = 0;
        
        String[] arr = String.valueOf(n).split("");
        
        for(int i=0; i< arr.length; i++ ){
            
            int max = Integer.parseInt(arr[i]);
            
            for(int j=i+1; j<arr.length; j++){
                int compare = Integer.parseInt(arr[j]);
                
                if(max < compare){
                    
                    arr[i] = String.valueOf(compare);
                    arr[j] = String.valueOf(max);
                    max = compare;
                }
            }
        }
      //  System.out.println(String.join("", arr));
       answer = Long.parseLong(String.join("", arr));
        
        return answer;
    }
	
	public static void main(){
		
		InverseInt inverse = new InverseInt();
		System.out.println(inverse.solution(118372));
		
	}
}