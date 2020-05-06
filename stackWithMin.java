 class minwith extends MyStack
{
	MyStack s2;
	public minwith()
	{
		s2=new MyStack();
		
	}
	public void push(int value)
	{
		if(value<=min())
		{
			s2.push(value);
			
		}
		super.push(value);
	}
	public int pop()
	{   int value=super.pop();
		if(value==min())
		{
			s2.pop();
		}
		return value;
	}
	public int min()
	{
		if(s2.isEmpty()) return  Integer.MAX_VALUE; 
		else{
			return s2.peek();
		}
	}
}
class MyStack {
	private static class StackNode {
		private int data;
		private StackNode next;
		
		public StackNode(int data) {
			this.data = data;
		}
		
		public int getData() {
			return data;
		}
	}
	
	private StackNode top;

	public int pop() {
		
		int item = top.getData();
		top = top.next;
		return item;
	}

	public void push(int item) { 
		StackNode t = new StackNode(item);
		t.next = top;
		top = t;
	} 

	public int peek() {
		
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	public static void main(String args[])
	{
	   minwith stk=new minwith();
	   stk.push(5);
	   stk.push(4);
	   stk.push(1);
	   stk.push(2);
	   stk.push(-3);
	   System.out.println("New min is " + stk.min());
	   System.out.println(stk.pop());
	   System.out.println("New min is " + stk.min());
	   System.out.println(stk.pop());
	   System.out.println("New min is "  + stk.min());
	}
}