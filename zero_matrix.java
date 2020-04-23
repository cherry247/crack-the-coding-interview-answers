import java.util.Random;
class abc
{
	public static void main(String args[])
	{
		int[][] matrix=randomMatrix(3,3,0,9);
		display(matrix);
		 
		boolean rowhasz=false;
		boolean colhasz=false;
		for(int j=0;j<matrix[0].length;j++)
		{
			if(matrix[0][j]==0)
			{
				rowhasz=true;
				break;
			}
		}
		for(int i=0;i<matrix.length;i++)
		{
			if(matrix[i][0]==0)
			{
				colhasz=true;
				break;
			}
		}
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				if(matrix[i][j]==0)
				{
					matrix[i][0]=0;
					matrix[0][j]=0;
					
				}
			}
			
		}
		for(int i=1;i<matrix.length;i++)
		{
			if(matrix[i][0]==0)
			{
				nullifyRow(matrix,i);
				
			}
		}
		for(int j=1;j<matrix[0].length;j++)
		{
			if(matrix[0][j]==0)
			{
				 nullifyColumn(matrix,j);
			}
		}
		
		if(rowhasz)
			nullifyRow(matrix,0);
		if(colhasz)
			 nullifyColumn(matrix,0);
	
	
	    display(matrix);
		
	}
	public static int[][] randomMatrix(int a,int b,int min,int max)
	{    int[][] matrix=new int[a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{ 
				Random rand=new Random();
				matrix[i][j]=rand.nextInt(max+1-min)+min ;
			}
		}
		return matrix;
	}
	public static void display(int[][] matrix)
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
	
	public static void nullifyColumn(int[][] matrix, int col) {
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][col] = 0;
		}		
	}		
	
	
	public static void nullifyRow(int[][] matrix, int row) {
		for (int j = 0; j < matrix[0].length; j++) {
			matrix[row][j] = 0;
		}		
	}
	
}