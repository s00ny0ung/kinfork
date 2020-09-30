class SumofValues {
    public long solution(int a, int b) {
        long answer = 0;
                               
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        
        for(int i=min; i<=max; i++){
            answer+=i;
        }
        
        return answer;
    }
	
	public static void main(String[] args){
		SumofValues solution = new SumofValues();
		System.out.println(solution.solution(5,3));
	}
}