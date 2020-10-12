import java.util.*;
public class Main
{
    public static void setZeros(int[][] m)
    {
        HashSet<Integer> rowHs = new HashSet<>();
        HashSet<Integer> colHs = new HashSet<>();
        
        //check which row-column is zero
        for(int i=0; i<m.length;i++)
        {
            for(int j=0; j<m[0].length;j++)
            {
                if(m[i][j]==0)
                {
                    rowHs.add(i);
                    colHs.add(j);
                }
            }
        }
        
        for(int i=0; i<m.length;i++)
        {
            if(rowHs.contains(i))
            {
                Arrays.fill(m[i],0);
                continue;
            }
            for(int j=0; j<m[0].length;j++)
            {
                if(colHs.contains(j))
                {
                    m[i][j]=0;
                }
            }
        }
        
        for(int i=0; i<m.length;i++)
        {
            for(int j=0; j<m[0].length;j++)
            {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
        
    }
    
	public static void main(String[] args) 
	{
	    Scanner src = new Scanner(System.in);
		System.out.println("Number of rows:");
		int row = src.nextInt();
		System.out.println("Number of columns:");
		int column = src.nextInt();
		int matrix[][] = new int [row][column];
		System.out.println("Enter the matrix:");
		for(int i=0; i<row; i++)
		{
		    for(int j=0; j<column; j++)
		    {
		        matrix[i][j]=src.nextInt();
		    }
		}
		setZeros(matrix);
	}
}
