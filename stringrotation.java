class abc
{
	public static void main(String args[])
	{
		String[][] pairs={{"apple","pleap"},{"mango","goman"},{"elbow","bovel"}};
		for(String[] s:pairs)
		{
			String word1=s[0];
			String  word2=s[1];
			boolean rotate=is_rotate(word1,word2);
			System.out.print(word1 + ", " + word2 + ": " + rotate);
			System.out.print("\n");
			
			
			
		}
	}
	public static boolean is_rotate(String s1,String s2)
	{
		int len=s1.length();
		if(len==s2.length() && len>0)
		{
			String s1s1=s1+s1;
			return is_substring(s1s1,s2);
		}
		return false;
	}
	public static boolean is_substring(String s1s1,String s2)
	{
		if(s1s1.indexOf(s2)>=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}