package tenDaysOfStatistics;

public class StandardDeviation {
	static double standardDeviation(int n, int[] arr) {
		double standardDeviation = 0;
		int sum = 0;
		double mean = 0;
		
		for (int i=0; i<n; i++) {
			sum += arr[i];
		}
		
		mean = (double) sum/n;
		
		double totalDevSum = 0;
		
		for (int i=0; i<n; i++) {
			totalDevSum += Math.pow(arr[i] - mean, 2);
		}
		
		standardDeviation = Math.sqrt(totalDevSum/n);

        return standardDeviation;
	}
}
