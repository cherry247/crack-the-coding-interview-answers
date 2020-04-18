import java.util.*;
class abc
{
	public static void main(String args[])
	{
		Scanner q=new Scanner(System.in);
		String s=q.nextLine();
		String t=q.nextLine();
		int [] letters=new int[128];
		char [] ch=s.toCharArray();
		boolean flag=true;
		for(char c: ch)
		{
			letters[c]++;
		}
		for(int i=0;i<t.length();i++)
		{
			int c=(int)t.charAt(i);
			letters[c]--;
			if(letters[c]<0)
			{
				System.out.print("not a permutation");
				flag=false;
				break;
			}
		}
		if(flag)
		{System.out.print("it is a permutation");}
		
	}
}