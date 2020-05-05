class stack
{
	static class stk
	{
		int arr[];
		int top[];
		int next[];
		int n,k;
		int free;
		stk(int k,int n)
		{
			this.k=k;
			this.n=n;
			arr=new int[n];
			top=new int[k];
			next=new int[n];
			for(int i=0;i<k;i++)
			{
				top[i]=-1;
			}
			free=0;
			for(int i=0;i<n-1;i++)
			{
				next[i]=i+1;
				
			}
			next[n-1]=-1;
			
			
		}
		boolean isFull()
		{
			return free==-1;
		}
		void push(int x,int sn)
		{
			if(isFull())
			{
				System.out.print("stack overflow");
				return;
			}
			int i=free;
			free=next[i];
			next[i]=top[sn];
			top[sn]=i;
			arr[i]=x;
		}
		int pop(int sn)
		{
			if(isEmpty(sn))
			{
				System.out.print("stack underflow");
				return Integer.MAX_VALUE;
			}
			int i=top[sn];
			top[sn]=next[i];
			next[i]=free;
			free = i;
			return arr[i];
			
		}
		boolean isEmpty(int sn)  
        { 
            return (top[sn] == -1); 
        } 
		
	}
	public static void main(String args[])
	{   int k = 3, n = 10;
		stk ks = new stk(k,n); 
  
        ks.push(15, 2); 
        ks.push(45, 2); 
		ks.push(17, 1); 
        ks.push(49, 1); 
        ks.push(39, 1);
		 ks.push(11, 0); 
        ks.push(9, 0); 
        ks.push(7, 0); 
		System.out.println("Popped  from stack 2 is " + ks.pop(2)); 
        System.out.println("Popped from stack 1 is " + ks.pop(1)); 
        System.out.println("Popped  from stack 0 is " + ks.pop(0)); 
	}
}