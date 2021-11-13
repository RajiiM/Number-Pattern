//OUTPUT
1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 
    5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5 
//

public class Pattern7 {

	public static void main(String[] args) 
	{
		for(int row = 1;row<=5;row++)
		{
			for(int col = 1; col<row; col++)
			{
				System.out.print(" ");
			}
			for(int col = row; col<=5; col++)
			{
				System.out.print(col + " ");
			}
			System.out.println();
		}
		for(int row = 5;row>=1;row--)
		{
			for(int col = 1; col<row; col++)
			{
				System.out.print(" ");
			}
			for(int col = row; col<=5; col++)
			{
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}