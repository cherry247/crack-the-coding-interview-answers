class demo
{
	public static void update(int n,int m,int i,int j)
	{
		int allone=~0;
		int left=allone<<(j+1);
		System.out.println(left);
		int right=(1<<i)-1;
		System.out.println(right);
		int mask=left|right;
		int n_clear=n&mask;
		int m_shift=m<<i;
		System.out.print(n_clear|m_shift);
	}
	public static void main(String args[])
	{
		int n=32,m=7,i=1,j=4;
	    update(n,m,i,j);
		
	}
}