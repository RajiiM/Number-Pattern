//OUTPUT
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
//

public class Pattern4 {

	public static void main(String[] args) 
	{
		for(int row = 5;row>=1;row--)
		{
			for(int col = 1; col<row; col++)
			{
				System.out.print(" ");
			}
			for(int col = 1; col<=6-row; col++)
			{
				System.out.print(6-row + " ");
			}
			System.out.println();
		}
	}
}