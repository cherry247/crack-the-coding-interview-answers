class demo
{
	public static int convert(int a,int b)
	{
		int count=0;
		for(int c=a^b;c!=0;c=c&(c-1))
		{
			count++;
		}
		return count;
	}
	public static void main(String[] args)
	{
		System.out.print(convert(10,10));
	}
}