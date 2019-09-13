package warmUp;

public class RepeatedString {
	static long repeatedString(String s, long n) {
		long answer = 0;
		int isA = 0;
		
		if (!s.contains("a")) {
			answer = 0;
		} else {
			for (int i=0; i<s.length(); i++) {
				System.out.println(s.substring(i, i+1));
				if (s.substring(i, i+1).equals("a")) isA++;
			}
			
			if ((n % s.length()) > 0) {
				String remain = s.substring(0, (int)(n % s.length()));
				for (int i=0; i<remain.length(); i++) {
					if (s.substring(i, i+1).equals("a")) answer++;
				}
			}
			System.out.println("Number of a in the word : " + isA);
			answer = answer + isA * (n / s.length());
		}
		
		return answer;
    }
}
