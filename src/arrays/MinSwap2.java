package arrays;

import java.util.Arrays;

public class MinSwap2 {
	static int minimumSwaps(int[] arr) {
		int answer = 0;
        
        for (int i=arr.length-1; i>=0; i--) {
        	int maxIndex = 0;
        	
        	if (arr[i] != i+1) {
        		for (int j=0; j<=i; j++) {
            		System.out.println("Checking : " + i + " - " + j);
            		
            		if (arr[i-j] == i+1) {
            			maxIndex = i-j;
            			break;
            		}
            	}
            	
            	if (arr[i] != i+1) {
            		int temp = arr[i];
                	arr[i] = arr[maxIndex];
                	arr[maxIndex] = temp;
                	answer++;
                	System.out.println("answer++");
            	}
        	}
        	
        	System.out.println(Arrays.toString(arr));
        }
        
        return answer;
    }
}
