package thirtyDaysChallenge;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class EighteenthDay {
	Stack<Character> myStack;
	Queue<Character> myQueue;
	
	EighteenthDay() {
		this.myStack = new Stack<Character>();
		this.myQueue = new ArrayDeque<Character>();
	}
	
	private void enqueueCharacter(char c) {
		myQueue.add(c);
	}
	
	private Character dequeueCharacter() {
		return myQueue.poll();
	}
	
	private void pushCharacter(char c) {
		myStack.push(c);
		
	}

	private Character popCharacter() {
		return myStack.pop();
	}
	
	public static void main(String[] args) {
        String input = "racecar";

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        EighteenthDay p = new EighteenthDay();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
