package warmUp;

public class JumpingOnClouds {
	static int jumpingOnClouds(int[] c) {
		int answer = c.length-1;
		
		for (int i=0; i<c.length-2; i++) {
			if (c[i+2]==0) {
				i++;
				answer--;
			}
		}
		
		return answer;
    }
}
