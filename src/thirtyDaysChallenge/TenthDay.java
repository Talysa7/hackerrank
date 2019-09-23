package thirtyDaysChallenge;

public class TenthDay {
	static int solution(int n) {
        String binaryString = Integer.toBinaryString(n);
        int maxCounter = 0;
        int currentCounter = 0;
        
        for (int i=0; i<binaryString.length(); i++) {
        	if (Integer.parseInt(binaryString.substring(i, i+1)) == 1) {
        		currentCounter++;
        		System.out.println("Current counter : " + currentCounter);
        		if (currentCounter > maxCounter) maxCounter = currentCounter;
        	} else {
        		currentCounter = 0;
        	}
        }
        
        return maxCounter;
    }
}
