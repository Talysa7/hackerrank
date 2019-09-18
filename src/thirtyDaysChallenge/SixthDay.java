package thirtyDaysChallenge;

import java.util.List;

public class SixthDay {
	static void solution(int n, List<String> str) {
        for (int i=0; i<str.size(); i++) {
        	String word = str.get(i);
        	String even = "";
        	String odd = "";
        	
        	for (int j=0; j<word.length(); j++) {
        		if (j % 2 == 0) {
        			even += word.substring(j, j+1);
        		} else {
        			odd += word.substring(j, j+1);
        		}
        	}
        	System.out.println(even + " " + odd);
        }
    }
}
