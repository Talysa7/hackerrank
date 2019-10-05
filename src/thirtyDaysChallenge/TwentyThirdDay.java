package thirtyDaysChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class MyNode{
    MyNode left,right;
    int data;
    MyNode(int data){
        this.data=data;
        left=right=null;
    }
}

public class TwentyThirdDay {
	static void levelOrder(MyNode root){
		List<Integer> allElements = new ArrayList<Integer>();
		Queue<MyNode> currentLevel = new LinkedList<MyNode>();
		Queue<MyNode> nextLevel = new LinkedList<MyNode>();
		MyNode currentNode = root;
		
		nextLevel.add(root);
		
		while (!nextLevel.isEmpty()) {
			currentLevel.addAll(nextLevel);
			nextLevel.clear();
			
			while (!currentLevel.isEmpty()) {
				currentNode = currentLevel.poll();
				allElements.add(currentNode.data);
				
				if (currentNode.left != null) {
					nextLevel.add(currentNode.left);
				}
				if (currentNode.right != null) {
					nextLevel.add(currentNode.right);
				}
			}
		}
		
		for (int i=0; i<allElements.size(); i++) {
			System.out.print(allElements.get(i) + " ");
		}
    }
	
	public static MyNode insert(MyNode root,int data){
        if(root==null){
            return new MyNode(data);
        }
        else{
        	MyNode cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        MyNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }	
}