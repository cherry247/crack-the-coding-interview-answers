
class list { 

/* Link list Node */
static class Node 
{ 
	int data; 
	Node next; 
} 

// A utility function to create a new node 
static Node newNode(int data) 
{ 
	Node new_node = new Node(); 
	new_node.data = data; 
	new_node.next = null; 
	return new_node; 
} 

// Function to make a new list 
// (using the existing nodes) and 
// return head of new list. 
static Node partition(Node head, int x) 
{ 
	/* Let us initialize start and tail nodes of 
	new list */
	Node tail = head; 

	// Now iterate original list and connect nodes 
	Node curr = head; 
	while (curr != null) 
	{ 
		Node next = curr.next; 
		if (curr.data < x) 
		{ 
			/* Insert node at head. */
			curr.next = head; 
			head = curr; 
		} 

		else // Append to the list of greater values 
		{ 
			/* Insert node at tail. */
			tail.next = curr; 
			tail = curr; 
		} 
		curr = next; 
	} 
	tail.next = null; 

	// The head has changed, so we need 
	// to return it to the user. 
	return head; 
} 

/* Function to print linked list */
static void printList(Node head) 
{ 
	Node temp = head; 
	while (temp != null) 
	{ 
		System.out.print(temp.data + " "); 
		temp = temp.next; 
	} 
} 

// Driver code 
public static void main(String[] args) 
{ 
	/* Start with the empty list */
	Node head = newNode(5); 
	head.next = newNode(5); 
	head.next.next = newNode(8); 
	head.next.next.next = newNode(2); 
	head.next.next.next.next = newNode(10); 
	head.next.next.next.next.next = newNode(2); 
	head.next.next.next.next.next.next = newNode(1); 
	printList(head);
	System.out.print("\n");
	int x = 5; 
	head = partition(head, x); 
	printList(head); 
} 
} 

/
