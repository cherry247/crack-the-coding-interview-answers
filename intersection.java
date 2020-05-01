class list { 


static class Node 
{ 
	int data; 
	Node next; 
} 
static class result
{
	Node tail;
	int size;
	result(Node tail,int size)
	{
		this.tail=tail;
		this.size=size;
	}
}
static result getTailAndSize(Node list)
{
	if(list==null) return null;
	int size=1;
	Node current=list;
	while(current.next!=null)
	{
		size++;
		current=current.next;
	}
	return new result(current,size);
}
static Node getKnode(Node head,int k)
{
	Node current=head;
	while(current!=null && k>0)
	{	
		k--;
		current=current.next;
		
	}
	return current;
}
static Node intersection(Node l1,Node l2)
{
	if(l1==null || l2==null) return null;
	
	result r1=getTailAndSize(l1);
	result r2=getTailAndSize(l2);
	if(r1.tail!=r2.tail) return null;
	Node x =r1.size < r2.size ? l1 : l2 ;
	Node longer=r1.size < r2.size ? l2 :  l1;
	longer=getKnode(longer,Math.abs(r1.size-r2.size));
	while(x!=longer)
	{
		x=x.next;
		longer=longer.next;
	}
	return longer;
	
}


static Node newNode(int data) 
{ 
	Node new_node = new Node(); 
	new_node.data = data; 
	new_node.next = null; 
	return new_node; 
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
	
	Node head = newNode(1); 
	head.next = newNode(3); 
	head.next.next = newNode(4); 
	head.next.next.next = newNode(1); 
	Node head1=newNode(3); 
	head1.next=head.next.next.next;
	
	head.next.next.next.next= newNode(0); 
	
	head.next.next.next.next.next= newNode(2); 
	
	head.next.next.next.next.next.next= newNode(7); 
	
	
	
	
	printList(head);
	System.out.print("\n");
	printList(head1);
	System.out.print("\n");
	Node inter=intersection(head,head1);
	printList(inter);
	
	
} 
} 