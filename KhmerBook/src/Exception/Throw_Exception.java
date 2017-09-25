package Exception;
/*We can throw exception by using keyword THROW
 * General formula
 * THROW EXCEPTIONOBJECT; which exceptionObject is object of exception class inherited from throwable*/
public class Throw_Exception {
	public static void main(String args[])
	{
		try
		{
			System.out.println("Before Throw");
			// Pass the error to catch block
			// After the throwing exception, we cannot implement any code under the keyword throw
			throw new ArithmeticException();
//			System.out.println("After throw ");
			
		}catch(ArithmeticException ex)
		{
			System.out.println("Exception caught");
			ex.printStackTrace();
		}
		
	
		try
	{
			System.out.println("Befor throw array");
			throw new ArrayIndexOutOfBoundsException();
	}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			ex.printStackTrace();
		}
		
		System.out.println("After try/catch block");
	}

}
