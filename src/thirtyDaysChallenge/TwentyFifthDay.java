package thirtyDaysChallenge;

import java.util.Scanner;

public class TwentyFifthDay {
	public static void checkPrime(int n) {
		boolean prime = true;
		
		if (n == 1) {
			prime = false;
		} else {
			while (prime) {
				for (int i=2; i<n; i++) {
					if (n%i == 0) {
						System.out.println(i);
						prime = false;
					}
					if (n > 1000 && i >= n/1000) {
						break;
					}
				}
				
				break;
			}
		}
		
		if (prime) {
			System.out.println("Prime");
		} else {
			System.out.println("Not prime");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        
        for (int i : arr) {
            checkPrime(i);
        }
	}
}
