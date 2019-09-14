package tenDaysOfStatistics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MeanMedianMode {
	static void solution(int n, int[] arr) {
		double mean = 0;
		double median = 0;
		int mode = arr[0];
		int sum = 0;
		Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
		
		Arrays.sort(arr);
		
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
			
			if (arr[i] < mode) mode = arr[i];
			
			if (!counter.containsKey(arr[i])) {
				counter.put(arr[i], 1);
			} else {
				counter.replace(arr[i], counter.get(arr[i]) + 1);
			}
		}
		
		mean = (double) sum / n;
		System.out.println(counter.get(2184));
		
		if (counter.values().contains(2)) {
			for (int key : counter.keySet()) {
				if (counter.get(key) > counter.get(mode)) {
					mode = key;
				} else if (counter.get(key) == counter.get(mode)) {
					if (key < mode) mode = key;
				}
			}
		}
		
		mean = (double) sum / n;
		
		if (n%2 == 1) {
			median = arr[(n/2) + 1];
		} else {
			median = (arr[(n/2)-1] + arr[n/2]) / 2.0;
		}
		
		System.out.println(String.format("%.1f", mean));
		System.out.println(String.format("%.1f", median));
		System.out.println(mode);
	}
}
