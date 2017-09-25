package throws_java;

import java.io.IOException;

/*throw is used to explicitly throw an exception from a method or any block
 * of code . General form of throw is as shown below:
 * 
 * The flow of execution of the programs stops immediately after the throw
 * statement is executed and the nearest enclosing try block is checked to see
 * if it has a catch statement that matches the type of exception.if it finds
 * a matfch, controlled is transferred to that statment otherwise next enclosing
 * try block is checked and so on. If no matching catch is found then the default
 * exception handler will halt the program.
 * 
 * */
public class ThrowExcep
{
	 static void fun()
	{
		 int x = 10;
			int sum =5;
		try
		{
			sum=sum+x;
			System.out.println("Before NullPointerException"+sum);
			throw new ArrayIndexOutOfBoundsException("demo");
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Caught inside fun().");
			System.out.println("Hwel");
			throw e; // rethrowing the exception
		}
		
	}

	public static void main(String args[])
	{
		try
		{
			fun();
		}
		catch(ArrayIndexOutOfBoundsException f)
		{
			System.out.println("Caught in main.");
		}
	}
}