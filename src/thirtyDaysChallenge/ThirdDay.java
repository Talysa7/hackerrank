package thirtyDaysChallenge;

public class ThirdDay {
	static String solve(int N) {
        String answer = "";

        if (N % 2 == 1) {
            answer = "Weird";
        } else if (N > 20) {
            answer = "Not Weird";
        } else if (N >=2 && N <=5) {
            answer = "Not Weird";
        } else if (N >= 6 && N <= 20) {
            answer = "Weird";
        }

        return answer;
    }
}
