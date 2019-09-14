package warmUp;

import java.util.Arrays;

public class NewYearChaos {
	static void minimumBribes(int[] q) {
		int answer = 0;
        boolean sorted = false;
        boolean chaos = false;
        int[] sortedQ = Arrays.copyOf(q, q.length);
        Arrays.sort(sortedQ);

        if(q.length > 2) {
            //2 1 5 3 4 : 3
            //2 5 1 3 4 : too chaotic
            while(!sorted && !chaos) {
                for (int i=0; i<q.length-1; i++) {
                    if ((q[i]-i) > 3) {
                        chaos = true;
                    } else if (q[i] > q[i+1]) {
                        int temp = q[i];
                        q[i] = q[i+1];
                        q[i+1] = temp;
                        answer++;
                    }
                }
                
                int count = 0;
                for (int i=0; i<q.length; i++) {
                    if (q[i] == sortedQ[i]) count++;
                }
                if (count == q.length) sorted = true;
            }
            
            if (chaos) System.out.println("Too chaotic");
            else System.out.println(answer);
        }
    }
}
