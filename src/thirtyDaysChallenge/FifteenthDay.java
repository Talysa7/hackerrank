package thirtyDaysChallenge;

public class FifteenthDay {
	public static  Node insert(Node head,int data) {
        //Complete this method
		if (head == null) {
			head = new Node(data);
		} else {
			head.next = insert(head.next, data);
		}
		
        return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
}

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}