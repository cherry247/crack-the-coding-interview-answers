import java.util.*;
class abc
{
	public static void main(String args[])
	{
		Scanner q=new Scanner(System.in);
		String str="Mr John Smith    ";
		int t=q.nextInt();
		char[] s=str.toCharArray();
		abc.replace(s,t);
		
	}
	public static void replace(char[] s,int truelength)
	{     
		int spacecount=0;
		int index,i=0;
		for(i=0;i<truelength;i++){
			if(s[i]==' '){
				spacecount++;
			}
		}
		index=truelength+spacecount*2;
		if(truelength<spacecount) s[truelength]='\0';
		for(i=truelength-1;i>=0;i--){
			if(s[i]==' '){
				s[index-1]='0';
				s[index-2]='2';
				s[index-3]='%';
				index=index-3;
				
			}
			else{
				s[index-1]=s[i];
				index--;
			}
		}
		for(i=0;i<s.length;i++){
		System.out.print(s[i]);}
		System.out.println(" " +s.length);
		
		
	}
}