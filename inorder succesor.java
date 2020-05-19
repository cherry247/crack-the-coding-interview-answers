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
	static List<Integer> lst=new ArrayList<Integer>();
	public static Integer inorder_suc(int n)
	{    
		 boolean f=false;
		for(Integer x:lst)
		{
			if(f)
			{
				return x;
			}
			if(x==n)
			{
				f=true;
				
				
			}
			
			
		}
		return null;
		
		
		
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
			lst.add(n.data);
			inorder(n.right);
		}
	}
	

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        
        Node root = null;
        
            root = insert(root,8);
			root = insert(root,4);
			root = insert(root,9);
			root = insert(root,1);
			root = insert(root,2);
			
			root = insert(root,3);
			root = insert(root,6);
			root = insert(root,5);
			
		    inorder(root);
			System.out.print(inorder_suc(9));
      
    }	
}
