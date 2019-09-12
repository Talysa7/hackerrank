package warmUp;

public class CountingValleys {
	static int countingValleys(int n, String s) {
		int answer = 0;
		int depth = 0;
		
		for (int i=0; i<n; i++) {
			if (s.substring(i, i+1).equals("U")) {
				depth++;
				
				if (depth==0) {
					System.out.println("Return to the sea level!");
					answer++;
				}
			} else {
				depth--;
			}
		}
		
		return answer;
    }
}
