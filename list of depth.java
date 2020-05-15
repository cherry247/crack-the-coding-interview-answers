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
	
	public static treenode insert(treenode root, int data) {
        if(root == null) {
            return new treenode(data);
        } else {
            treenode cur;
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
	public static ArrayList<LinkedList<treenode>> clll(treenode root)
	{
		ArrayList<LinkedList<treenode>> lists=new ArrayList<LinkedList<treenode>>();
		clll(root,lists,0);
		return lists;
	}
	public static void clll(treenode root,ArrayList<LinkedList<treenode>> lists,int level)
	{
		if(root==null) return;
		LinkedList<treenode> list=null;
		if(level==lists.size())
		{
			list=new LinkedList<treenode>();
			lists.add(list);
		}
		else
		{
			list=lists.get(level);
		}
		list.add(root);
		clll(root.left,lists,level+1);
		clll(root.right,lists,level+1);
	}
	public static void printR(ArrayList<LinkedList<treenode>> lists)
	{ 
		int depth=0;
		for( LinkedList<treenode> x:lists)
		{
			Iterator<treenode> i=x.listIterator();
			System.out.print("linked list depth"+depth+":");
			while(i.hasNext())
			{System.out.print(" "+(i.next()).data);}
			System.out.println();
			depth++;
		}
		
	}
	public static void main(String[] args) {
        
      
        treenode root = null;
       
            root = insert(root, 5);
			root = insert(root, 4);
			root = insert(root, 2);
			root = insert(root, 3);
			root = insert(root, 1);
			root = insert(root, 6);
			root = insert(root, 7);
			root = insert(root, 8);
			
        ArrayList<LinkedList<treenode>> list=clll(root);
		printR(list);
        
        
    }	

}