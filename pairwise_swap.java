class demo
{   
	public static int flip(int x)
	{
		return (( x & 0xaaaa)>>>1)|((x & 0x5555)<<1);
	}
	public static void main(String args[])
	{
		int a=17;
		System.out.println(Integer.toBinaryString(a));
		System.out.print(Integer.toBinaryString(flip(a)));
	}
}