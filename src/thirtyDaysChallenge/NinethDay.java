package thirtyDaysChallenge;

public class NinethDay {
	static int solution(int n) {
		if (n<=1) return n;
        else return n * solution(n-1);
    }
}
