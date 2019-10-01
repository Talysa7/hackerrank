package thirtyDaysChallenge;
import java.util.*;

interface AdvancedArithmetic{
	   int divisorSum(int n);
	}

public class NineteenthDay implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int answer=0;

        for (int i=1; i<=n; i++) {
            if (n%i == 0) {
                answer += i;
            }
        }

        return answer;
    }
    
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new NineteenthDay(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}