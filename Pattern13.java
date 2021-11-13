//OUTPUT
2 
4 6 
8 10 12 
14 16 18 20 
22 24 26 28 30 

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
//

public class Pattern13 {
	static int a = 0;
	static int b = 1;
	
	public static void main(String[] args) 
	{	
		Pattern13 obj = new Pattern13();
		obj.method1();
		System.out.println();
		obj.method2();		
	}
	
	public void method1()
	{
	for(int row = 1;row<=5;row++)
	{
		for(int col = 1; col<=row; col++)
		{				
			System.out.print((a=a+2) + " ");
		}
		System.out.println();
	}
	}
	
	public void method2()
	{
	for(int row = 1;row<=5;row++)
	{
		for(int col = 1; col<=row; col++)
		{				
			System.out.print((b++) + " ");
		}
		System.out.println();
	}
	}
}