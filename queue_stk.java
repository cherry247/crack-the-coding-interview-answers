class myqueue extends MyStack
{  MyStack stknewest;
	MyStack stkoldest;
   
	
	public myqueue()
	{
		 stknewest=new MyStack();
		 stkoldest=new MyStack();
	}
	public void add(int i)
	{
		stknewest.push(i);
	}
	public void shiftstack()
	{
		if(stkoldest.isEmpty())
		{
			while(!stknewest.isEmpty())
			{
				stkoldest.push(stknewest.pop());
			}
		}
	}
	public int peek()
	{
		shiftstack();
		return stkoldest.peek();
	}
	public int remove()
	{
		shiftstack();
		return stkoldest.pop();
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
	   myqueue stk=new myqueue();
	  
	   stk.add(5);
	   stk.add(4);
	   stk.add(1);
	   stk.add(2);
	   stk.add(-3);
	   System.out.println(stk.remove());
	   System.out.println(stk.remove());
	   stk.add(10);
	   
	  
	   
	}
}