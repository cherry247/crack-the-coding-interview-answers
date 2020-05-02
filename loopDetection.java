class list { 


static class Node 
{ 
	int data; 
	Node next; 
} 




static Node newNode(int data) 
{ 
	Node new_node = new Node(); 
	new_node.data = data; 
	new_node.next = null; 
	return new_node; 
} 
static Node findstart(Node head)
{
	Node slow=head;
	Node fast=head;
	while(fast!=null && fast.next!=null)
	{
		slow=slow.next;
		fast=fast.next.next;
		if(slow==fast) break;
	}
	if(fast==null || fast.next==null) return null;
	slow=head;
	while(slow!=fast)
	{
		slow=slow.next;
		fast=fast.next;
	}
	return fast;
}


static void printList(Node head) 
{ 
	Node temp = head; 
	while (temp != null) 
	{ 
		System.out.print(temp.data + " "); 
		temp = temp.next; 
	} 
} 
static void printCl(Node head)
{
	Node point=head;
	Node current=head;
	while(current!=null )
	{
		System.out.print(current.data + " "); 
		current = current.next; 
		if(current==point)
		{
			break;
		}
	}
}
 

public static void main(String[] args) 
{ 
	
	Node head = newNode(1); 
	head.next = newNode(3); 
	head.next.next = newNode(4); 
	head.next.next.next = newNode(1); 
	
	
	
	head.next.next.next.next= newNode(0); 
	
	
	head.next.next.next.next.next= newNode(2); 
	
	head.next.next.next.next.next.next= newNode(7); 
	head.next.next.next.next.next.next.next= newNode(7); 
	head.next.next.next.next.next.next.next.next=head.next.next.next;
	
	
	
	
	
	Node x=findstart(head);
     printCl(x);
	
	
} 
} 