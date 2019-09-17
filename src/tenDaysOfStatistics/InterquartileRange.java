package tenDaysOfStatistics;

import java.util.Arrays;

public class InterquartileRange {
	static void solution (int n, int[] elemArr, int[] freqArr) {
		int total = 0;
		double Q1 = 0;
		double Q3 = 0;
		
		for (int i=0; i<freqArr.length; i++) {
			total += freqArr[i];
		}
		
		System.out.println("Total length : " + total);
		
        int[] newArr = new int[total];
        int counter = 0;
        
        while (counter < total) {
        	for (int i=0; i<n; i++) {
        		for (int j=0; j<freqArr[i]; j++) {
        			newArr[counter] = elemArr[i];
            		counter++;
        		}
        	}
        }
        
        Arrays.sort(newArr);
        System.out.println(Arrays.toString(newArr));
        
        int length = newArr.length;
        int halfLength = length/2;
        int quaterLength = halfLength/2;
        int lowerUpperLength = 0;
        
        if (total%2 == 0) {
        	lowerUpperLength = (total - 2)/2;
        } else {
        	lowerUpperLength = (total - 1)/2;
        }
        
        System.out.println("Half length : " + halfLength);
        System.out.println("Quater length : " + quaterLength);
        System.out.println("Lower and upper length : " + lowerUpperLength);
        
        
    	if (lowerUpperLength%2 == 0) {
    		Q1 = (newArr[quaterLength-1] + newArr[quaterLength]) / 2;
        	Q3 = (newArr[halfLength+quaterLength-1] + newArr[halfLength+quaterLength]) / 2;
    	} else {
    		Q1 = newArr[lowerUpperLength/2];
        	Q3 = newArr[halfLength + quaterLength + 1];
    	}
        
        System.out.println("Q1 : " + Q1);
        System.out.println("Q3 : " + Q3);
        System.out.println(Q3-Q1);
    }
	
	public static void main(String[] args) {
		int n = 6;
		int[] elemArr = {6, 12, 8, 10, 20, 16};
		int[] freqArr = {5, 4, 3, 2, 1, 5};
		
		solution(n, elemArr, freqArr);
	}
}
