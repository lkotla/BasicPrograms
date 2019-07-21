package demo;

public class ArithmeticOperations {
	public int Add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		return(c);
	}
	
	public void Compare(int c)
	{
		ArithmeticOperations obj =new ArithmeticOperations();
		obj.Add(25,25);
		
		if(c>10)
		{
			System.out.println("result is greater than 10");
		}
		else
		{
			System.out.println("result is less than 10");
	
		}
	}

}
