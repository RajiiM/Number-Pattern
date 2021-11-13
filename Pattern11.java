//OUTPUT
1                 1 
1 2             2 1 
1 2 3         3 2 1 
1 2 3 4     4 3 2 1 
1 2 3 4 5 5 4 3 2 1 
//

public class Pattern11 {

	public static void main(String[] args) 
	{		
		for(int row = 1;row<=5;row++)
		{
			for(int col = 1; col<=row; col++)
			{
				System.out.print(col + " ");
			}
			for(int space = row; space<5; space++)
			{
				System.out.print(" " + " ");
			}			
			for(int space = 5; space>row;space--)
			{
				System.out.print(" " + " ");	
			}
			for(int col = row; col>= 1;col--)
			{
				System.out.print(col + " ");	
			}
			System.out.println();
		}
	}
}