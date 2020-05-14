import java.util.*; 
class treenode
{
	treenode left;
	treenode right;
	int data;
	treenode(int data)
	{
		this.data=data;
		left=null;
		right=null;
	}
	
}
class test
{
	public static treenode cmbst(int array[])
	{
		return cmbst(array,0,array.length-1);
	}
	public static treenode cmbst(int arr[],int start,int end)
	{
		if(start>end) return null;
		int mid=(start+end)/2;
		treenode n=new treenode(arr[mid]);
		n.left=cmbst(arr,start,mid-1);
		n.right=cmbst(arr,mid+1,end);
		return n;
	}
	public static void inorder(treenode n)
	{
		if(n!=null)
		{
			inorder(n.left);
			System.out.print(n.data+" ");
			inorder(n.right);
		}
	}
	public static void preorder(treenode n)
	{
		if(n!=null)
		{   System.out.print(n.data+" ");
			preorder(n.left);
			preorder(n.right);
		}
	}
	public static void main(String args[])
	{
		int[] arr={1,2,3,4,5,6,7,8};
		treenode x=cmbst(arr);
		System.out.println("inorder traversal:");
		inorder(x);
		System.out.println("\n");
		
		System.out.println("preorder traversal:");
		preorder(x);
		
	}
}