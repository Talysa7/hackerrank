package warmUp;

public class HourGlassSum {
	static int hourglassSum(int[][] arr) {
		int max = -2147483648;
		int sum = 0;
		
		for(int i=0; i<arr.length-2; i++) {
			for (int j=0; j<arr[0].length-2; j++) {
				sum = 0;
				sum += arr[i][j] + arr[i][j+1] + arr[i][j+2];
				sum += arr[i+1][j+1];
				sum += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
				System.out.println("Sum of this hourglass : " + sum);
				if(max<sum) max=sum;
			}
		}
		
		return max;
    }
}
