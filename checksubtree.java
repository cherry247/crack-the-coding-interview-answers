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
	public static boolean containtree(Node t1,Node t2)
	{
		if(t2==null) return true;
		return subtree(t1,t2);
	}
	public static boolean subtree(Node r1,Node r2)
	{
		if(r1==null) return false;
		else if(r1.data==r2.data && match(r1,r2)) return true;
		
		return subtree(r1.left,r2)|| subtree(r1.right,r2);
	}
	public static boolean match(Node r1,Node r2)
	{
		if(r1==null &&r2==null) return true;
		else if(r1==null||r2==null) return false;
		else if(r1.data!=r2.data) return false;
		else return match(r1.left,r2.left) && match(r1.right,r2.right);
	}
	
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

    public static void main(String[] args) {
       
        
        Node root = null;
        Node root1=null;
            root = insert(root,8);
			root = insert(root,4);
			root = insert(root,9);
			root = insert(root,1);
			root = insert(root,2);
			
			root = insert(root,3);
			root = insert(root,6);
			root = insert(root,5);
			root1=insert(root1,2);
			root1=insert(root1,19);
			
			inorder(root);
			System.out.print('\n');
			inorder(root1);
			System.out.print(containtree(root,root1));
			
      
    }	
}
