package thirtyDaysChallenge;

public class SeventhDay {
	static void solution(int n, int[] arr) {
        for (int i=1; i<=n; i++) {
            System.out.print(arr[n-i] + " ");
        }
    }
}
