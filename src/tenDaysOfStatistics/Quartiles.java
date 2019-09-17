package tenDaysOfStatistics;

import java.util.*;

public class Quartiles {
	static void solution(int n, int[] arr) {
        int Q1 = 0;
        int Q2 = 0;
        int Q3 = 0;
        int X = Math.round(n/2);
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        //This is INSANE!
        if (n%2 == 1) {
            Q2 = arr[Math.round(n/2)];
            Q1 = (arr[(X-1)/2] + arr[X/2]) / 2;
            Q3 = (arr[n-(X/2)-1] + arr[n-(X/2)]) / 2;
        } else {
            Q2 = Math.round((arr[X-1] + arr[X])/2);
            if (n>10) {
            	Q1 = (arr[(X-1)/2] + arr[X/2]) / 2;
                Q3 = (arr[n-(X/2)-1] + arr[n-(X/2)]) / 2;
            } else {
            	Q1 = arr[(X/2)];
                Q3 = arr[n-(X/2)-1];
            }
        }
        
        System.out.println(Q1);
        System.out.println(Q2);
        System.out.println(Q3);
    }
}
