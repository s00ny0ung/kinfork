public class SecretMap {

	private int[] parseBinaryNumber(int length, int number) {
		
		int[] intArr = new int[length];
		int mok = number;
		length -= 1;
		
		if(number == 0) {
			return intArr;
		}
		
		while(mok != 1) {
			intArr[length] = (mok%2);
			mok = mok/2;
			length-=1;
			
		}

		if(mok == 1) {
			intArr[length] = mok;
		}
		
		return intArr;
	}

	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = {};
		answer = new String[n];
		
		for (int i = 0; i < n; i++) {

			int arr1Number = arr1[i]; // 9
			int arr2Number = arr2[i]; // 30

			int[] arr1Char = parseBinaryNumber(n, arr1Number);
			int[] arr2Char = parseBinaryNumber(n, arr2Number);

			StringBuilder tempSb = new StringBuilder();

			for (int j = 0; j < n; j++) {

				if (arr1Char[j] == 0 && arr2Char[j] == 0) {
					tempSb.append(" ");
				}else {
					tempSb.append("#");
				}
			}
			
			answer[i] = tempSb.toString();

		}

		return answer;
	}

	public static void main(String[] args) {

		SecretMap secretMap = new SecretMap();
		/*
		 * n 5 arr1 [9, 20, 28, 18, 11] arr2 [30, 1, 21, 17, 28] result
		 * ["#####","# # #", "### #", "# ##", "#####"]
		 */

		int n = 5;
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };

		String[] answer = secretMap.solution(n, arr1, arr2);

		for (String str : answer) {
			System.out.print("\"" + str + "\", ");
		}
	}
}