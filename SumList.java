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


static Node sum(Node l1,Node l2,int carry) 
{ 
	
	if(l1==null && l2==null && carry==0)  return null;
	Node result=new Node();
	int value=carry;
	if(l1!=null) value+=l1.data;
	if(l2!=null) value+=l2.data;
	result.data=value%10;
	if(l1!=null || l2!=null)
	{
		Node more=sum(l1==null?null:l1.next,l2==null?null:l2.next,value>=10?1:0);
		result.next=more;
	}
	
	return result;
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
 

public static void main(String[] args) 
{ 
	/* Start with the empty list */
	Node head = newNode(5); 
	head.next = newNode(8); 
	head.next.next = newNode(4); 
	head.next.next.next = newNode(2); 
	Node head1=newNode(3);
	head1.next = newNode(5); 
	head1.next.next = newNode(3); 
	head1.next.next.next = newNode(1); 
	
	printList(head);
	System.out.print("\n");
	printList(head1);
	System.out.print("\n");
	Node s=sum(head,head1,0);
	printList(s);
	
} 
} 


