package thirtyDaysChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LinkedNode {
	int data;
	LinkedNode next;

	LinkedNode(int d) {
		data = d;
		next = null;
	}
}

public class TwentyFourthDay {
	public static LinkedNode removeDuplicates(LinkedNode head) {
		LinkedNode answer = null;
		List<Integer> arr = new ArrayList<Integer>();
		List<Integer> concat = new ArrayList<Integer>();
		LinkedNode next = null;
		boolean finish = false;

		while (!finish) {
			if (next == null) {
				next = head;
			}
			
			if (next.next == null) {
				arr.add(next.data);
				finish = true;
			} else {
				arr.add(next.data);
				next = next.next;
			}
		}
		
		for (int i : arr) {
			if (!concat.contains(i)) {
				concat.add(i);
				answer = insert(answer, i);
			}
		}

		return answer;
	}

	public static LinkedNode insert(LinkedNode head, int data) {
		LinkedNode p = new LinkedNode(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			LinkedNode start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(LinkedNode head) {
		LinkedNode start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		LinkedNode head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);

	}
}