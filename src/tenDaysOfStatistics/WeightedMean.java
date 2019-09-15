package tenDaysOfStatistics;

public class WeightedMean {
	static void solution(int n, int[] numArr, int[] weightArr) {
        double weightedMean = 0;
        double numSum = 0;
        double weightSum = 0;

        for (int i=0; i<n; i++) {
            numSum += numArr[i] * weightArr[i];
            weightSum += weightArr[i];
        }
        
        weightedMean = numSum/weightSum;

        System.out.printf("%.1f", weightedMean);
    }
}
