import java.util.*;

class abc
{
	public static void main(String args[])
	{  boolean x;
		String first="pale";
		String second="palis";
		x=oneEditAway(first,second);
		System.out.print(x);
		
		
		
	}
	public static boolean oneEditAway(String first,String second)
	{
		if(first.length()==second.length()) return replace(first,second);
		else if(first.length()+1==second.length()) return insert(first,second);
		else if(first.length()-1==second.length()) return insert(second,first);
		else return false;
		
	}
	public static boolean replace(String s1,String s2)
	{  boolean founddiff=false;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				if(founddiff) return false;
				
				founddiff=true;
			}
			
		
	}
	    return true;
	}
	public static boolean insert(String s1,String s2)
	{
		int inx1=0;
		int inx2=0;
		while(inx1<s1.length()&& inx2<s2.length())
		{
			if(s1.charAt(inx1)!=s2.charAt(inx2))
			{
				if(inx1 != inx2)
				{
					return false;
				}
				inx2++;
			}
			else{
				inx1++;
				inx2++;
			}
		
			
		}
		return true;
	}
	
	
}