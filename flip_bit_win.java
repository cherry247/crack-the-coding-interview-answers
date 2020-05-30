class demo
{   
	public static int flip(int a)
	{
		if(~a==0) return 	Integer.BYTES*8;
		int cl=0,pl=0,maxl=1;
		while(a!=0)
		{
			if((a&1)==1) cl++;
			else if((a&1)==0)
			{   
				System.out.print(a&2);
				pl=(a&2)==0?0:cl;
				cl=0;
			}
			maxl=Math.max(pl+cl+1,maxl);
			a>>>=1;
		}
		return maxl;
	}
	public static void main(String args[])
	{
		int a=177;
		System.out.println("Binary is" + Integer.toBinaryString(a));
		System.out.print(flip(a));
	}
}