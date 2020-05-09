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
	public void sort(MyStack s)
	{
		MyStack r=new MyStack();
		while(!s.isEmpty())
		{
			int tmp=s.pop();
			while(!r.isEmpty()&& r.peek()>tmp)
			{
				s.push(r.pop());
			}
			r.push(tmp);
		}
		while(!r.isEmpty())
		{
			s.push(r.pop());
		}
		
	}
	public static void main(String args[])
	{
		MyStack stk=new MyStack();
	   stk.push(5);
	   stk.push(4);
	   stk.push(1);
	   stk.push(-2);
	   stk.push(3);
	   stk.sort(stk);
	   System.out.println(stk.pop());
	   System.out.println(stk.pop());
	   System.out.println(stk.pop());
	   System.out.println(stk.pop());
	   
	}
}