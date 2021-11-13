//OUTPUT
5 4 3 2 1 1 2 3 4 5 
5 4 3 2     2 3 4 5 
5 4 3         3 4 5 
5 4             4 5 
5                 5 
//

public class Pattern12 {

	public static void main(String[] args) 
	{		
		for(int row = 5;row>=1;row--)
		{
			for(int col = 5; col>=6-row; col--)
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
			for(int col = 6-row; col<= 5;col++)
			{
				System.out.print(col + " ");	
			}
			System.out.println();
		}
	}
}