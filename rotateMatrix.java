import java.util.Random;

class abc
{
	public static void main(String args[])
	{
		int[][] matrix=randomMatrix(3,3,0,9);
		printMatrix(matrix);
		rotateMatrix(matrix);
		System.out.println();
		printMatrix(matrix);
	}
	public static int[][] randomMatrix(int a,int b,int min,int max)
	{ 
		int[][] matrix=new int[a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				matrix[i][j]=randomInt(min,max);
			}
		}
		return matrix;
		
	}
	public static int randomInt(int min,int max)
	{
		Random rand=new Random();
		return rand.nextInt(max+1-min)+min;
	}
	public static void printMatrix(int[][]matrix)
	{
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(" "+matrix[i][j]);
			}
			System.out.println();
			
		}
	}
	public static boolean rotateMatrix(int[][] matrix)
	{
		if(matrix.length==0|| matrix.length !=matrix[0].length) return false;
		int n=matrix.length;
		for(int layer=0;layer<n/2;layer++)
		{
			int first=layer;
			int last=n-1-layer;
			for(int i=first;i<last;i++)
			{
				int offset=i-first;
				int top=matrix[first][i];
				matrix[first][i]=matrix[last-offset][first];
				matrix[last-offset][first]=matrix[last][last-offset];
				matrix[last][last-offset]=matrix[i][last];
				matrix[i][last]=top;
				
				
				
			}
		}
		return true;
	}
	
}