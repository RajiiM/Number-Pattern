//OUTPUT
    5 
   4 4 
  3 3 3 
 2 2 2 2 
1 1 1 1 1 
//

public class Pattern5 {

	public static void main(String[] args) 
	{
		for(int row = 5;row>=1;row--)
		{
			for(int col = 1; col<row; col++)
			{
				System.out.print(" ");
			}
			for(int col = 5; col>=row; col--)
			{
				System.out.print(row + " ");
			}
			System.out.println();
		}
	}
}