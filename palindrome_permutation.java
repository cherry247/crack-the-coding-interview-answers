import java.util.*;

class abc
{
	public static void main(String args[])
	{
		Scanner q=new Scanner(System.in);
		String phrase=q.nextLine();
		int countOdd = 0;
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		for (char c : phrase.toCharArray()) {
			int x =getCharNum(c);
			if (x != -1) {
				table[x]++;
				if (table[x] % 2 == 1) {
					countOdd++;
				} else {
					countOdd--;
				}
			

				
			}
		}
		System.out.print(countOdd <= 1);
		
		
		
		
		
	}
	public static int getCharNum(Character c){
		int a=Character.getNumericValue('a');
       	int z=Character.getNumericValue('z'); 
		int val=Character.getNumericValue(c);
		if(val>=a	&& val<=z)
		{
			return val-a;
		}
		return -1;
	}
	
	
}