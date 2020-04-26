class list
{
	node head;
	static class node{
		int data;
		node next;
		node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public static class index
	{
		public int value=0;
	}	
	public static list insert(list l,int data)
	{
		node new_node=new node(data);
		new_node.next=null;
		if(l.head==null)
		{
			l.head=new_node;
			
		}
		else
		{
			node last=l.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=new_node;
		}
		return l;
	}
	public static void printlist(list l)
	{
		node current=l.head;
		System.out.print("linkedlist:");
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	public static void main(String args[])
	{
		list l=new list();
		l=insert(l,3);
		l=insert(l,4);
		l=insert(l,5);
		l=insert(l,1);
		l=insert(l,4);
		l=insert(l,5);
		l=insert(l,1);
		l=insert(l,9);
		l=insert(l,2);
		l=insert(l,7);
		
		printlist(l);
		int k=3;
		node y;
		y=kthToLast(l,k);
		System.out.print("\nkth element to the data is :");
		System.out.print(y.data);
		
	}
	public static node kthToLast(list l,int k)
	{
		node p1=l.head;
		node p2=l.head;
		for(int i=0;i<k;i++)
		{
			if(p1==null)return null;
			p1=p1.next;
		}
		while(p1!=null)
		{
			p1=p1.next;
			p2=p2.next;
		}
		return p2;
	}
	
}