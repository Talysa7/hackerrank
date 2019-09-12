package warmUp;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
	static int sockMerchant(int n, int[] ar) {
        int answer = 0;
        Map<Integer, Integer> sortedSocks = new HashMap<Integer, Integer>();
        
        //counting socks per colors
        for (int i : ar) {
            if (!sortedSocks.isEmpty() && sortedSocks.containsKey(i)) {
                sortedSocks.replace(i, sortedSocks.get(i)+1);
                System.out.println("Add one to the same socks.");
                System.out.println("Now socks of " + i + " color are " + sortedSocks.get(i));
            } else {
                sortedSocks.put(i, 1);
                System.out.println("There is no socks in this color yet.");
                System.out.println("Now color " + i + " has " + sortedSocks.get(i) + " socks.");
            }
        }

        //how many couples?
        for (int i : sortedSocks.values()) {
            answer += i / 2;
            System.out.println("It was " + i + "of socks in this color, so " + i%2 + "couples.");
        }
        
        return answer;
    }
}
