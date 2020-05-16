import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
	public static void inorder(Node n)
	{
		if(n!=null)
		{
			inorder(n.left);
			System.out.print(n.data+" ");
			inorder(n.right);
		}
	}
	public static int checkHeight(Node root)
	{
		if(root==null) return -1;
		int lheight=checkHeight(root.left);
		if(lheight==Integer.MIN_VALUE) return Integer.MIN_VALUE;
		int rheight=checkHeight(root.right);
		if(rheight==Integer.MIN_VALUE) return Integer.MIN_VALUE;
		int heightdiff=lheight-rheight;
		if(Math.abs(heightdiff)>1) return Integer.MIN_VALUE;
		else return 1+Math.max(lheight,rheight);
	}
	public static boolean isbalanced(Node root)
	{
		return checkHeight(root)!=Integer.MIN_VALUE;
	}

    public static void main(String[] args) {
        
        
        Node root = null;
        
            root = insert(root,4);
			root = insert(root,2);
			root = insert(root,3);
			root = insert(root,1);
			root = insert(root,5);
			
			root = insert(root,6);
			//root = insert(root,7);
			//root = insert(root,8);
			
			System.out.print(isbalanced(root));
       
    }	
}