package thirtyDaysChallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EighthDay {
	public static void main(String []argh){
        Map<String, Integer> contact = new HashMap<String, Integer>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            contact.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (contact.get(s) != null) {
                System.out.println(s + "=" + contact.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
