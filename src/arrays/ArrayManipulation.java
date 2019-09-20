package arrays;

import java.util.Arrays;

public class ArrayManipulation {
	static long arrayManipulation(int n, int[][] queries) {
		long answer = 0;
		int[] newArr = new int[n];
		
		for (int[] arr : queries) {
			System.out.println("Array to add : " + Arrays.toString(arr));
			
			int startIndex = arr[0]-1;
			int endIndex = arr[1];
			
			for (int i=startIndex; i<endIndex; i++) {
				newArr[i] += arr[2];
				if (answer < newArr[i]) answer = newArr[i];
			}
			
			System.out.println("Current newArr : " + Arrays.toString(newArr));
		}
		
		return answer;
    }
	public static void main(String[] args) {
		int n = 10;
		int[][] queries = {{1, 5, 3}, {4, 8, 7}, {6, 9, 1}};
		System.out.println(arrayManipulation(n, queries));
	}
}
