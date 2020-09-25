public class LeastCommonMultipleN {
	
	public int solution(int[] arr){
		int answer = arr[0];
        
        for(int i=1; i<arr.length; i++){
            answer = lcm(answer, arr[i]);
        }
        
        return answer;
	}
	
	public static int gcd(int a, int b){        
        while(b != 0){
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public static int lcm(int a, int b){
        return (a*b) / gcd(a,b);
    }

	public static void main(String[] args){
		LeastCommonMultipleN lcm = new LeastCommonMultipleN();
		System.out.println(lcm.solution(new int[] {2,6,8,14}));
	}

}