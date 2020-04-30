
class list { 


static class Node 
{ 
	int data; 
	Node next; 
} 
static class result
{
	Node node;
	boolean result;
	result(Node node,boolean result){
		this.node=node;
		this.result=result;
		
	}
}
static boolean isPalindrome(Node head)
{
	int length=lengthOfList(head);
	result p=isPalindromeRecurse(head,length);
	return p.result;
}
static result isPalindromeRecurse(Node head,int length)
{
	if(head==null || length<=0) return new result(head,true);
	else if(length==1) return new result(head.next,true);
	result r=isPalindromeRecurse(head,length-2);
	if(!r.result || r.node==null) return r;
	r.result=(head.data==r.node.data);
	r.node=r.node.next;
	return r;
}
static int lengthOfList(Node head)
{
	int size=0;
	while(head!=null)
	{
		size++;
		head=head.next;
	}
	return size;
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
	/* Start with the empty list */
	Node head = newNode(1); 
	head.next = newNode(1); 
	head.next.next = newNode(1); 
	head.next.next.next = newNode(1); 
	
	
	printList(head);
	System.out.print("\n");
	boolean p=isPalindrome(head);
	if(p) System.out.print("palidrome");
	else  System.out.print(" not palidrome");
	
} 
} 