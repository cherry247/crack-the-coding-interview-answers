class demo
{
	public static String printb(Double num)
	{
		if(num>=1|| num<=0)
		{
			return "ERROR";
		}
		StringBuilder binary=new StringBuilder();
		binary.append('.');
		
		while(num>0)
		{
			if(binary.length()>=32) return "ERROR";
			Double r=num*2;
			if(r>=1)
			{
				binary.append(1);
				num=r-1;
			}else
			{
				binary.append(0);
				num=r;
			}
			
		}
		return binary.toString();
	}
	public static void main(String args[])
	{
		System.out.print(printb(0.25));
	}
	
}
