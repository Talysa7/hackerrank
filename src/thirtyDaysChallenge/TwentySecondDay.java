package thirtyDaysChallenge;

import java.util.Scanner;

class TreeNode{
    TreeNode left,right;
    int data;
    TreeNode(int data){
        this.data=data;
        left=right=null;
    }
}

public class TwentySecondDay {
	public static int getHeight(TreeNode root){
		int rightHeight = 0;
		int leftHeight = 0;
		
		if (root.right != null) {
			rightHeight++;
			rightHeight += getHeight(root.right);
		}
		
		if (root.left != null) {
			leftHeight++;
			leftHeight += getHeight(root.left);
		}
		
		if (rightHeight > leftHeight) {
			return rightHeight;
		} else {
			return leftHeight;
		}
    }

    public static TreeNode insert(TreeNode root,int data){
        if(root==null){
            return new TreeNode(data);
        }
        else{
        	TreeNode cur;
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
        TreeNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
