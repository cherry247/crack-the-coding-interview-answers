class list{
	 Node head;
 static class Node
{
	
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		next=null;
	}
	
}

	public static list insert(list l,int data)
	{
		Node new_node=new Node(data);
		new_node.next=null;
		if(l.head==null)
		{
			l.head=new_node;
			
		}
		else
		{
			Node last=l.head;
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
		Node current=l.head;
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
		System.out.println("\n");
		System.out.println("after removing the duplicates:");
		removedups(l);
		printlist(l);
	}
	public static void removedups(list l)
	{
		Node current=l.head;
		while(current!=null)
		{
			Node runner=current;
			while(runner.next!=null)
			{
				if(runner.next.data==current.data)
				{
					runner.next=runner.next.next;
					
				}
				runner=runner.next;
			}
			current=current.next;
		}
	}
}
