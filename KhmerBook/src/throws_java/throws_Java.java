package throws_java;

import java.io.IOException;

/*throws is a keyword in Java which is used in the signature of method to
 *  indicate that this method might throw one of the listed type exceptions.
 *   The caller to these methods has to handle the exception using a 
 *   try-catch block.
 *   
 *   throw keyword is used to throw Exception from any method or
 *    static block in Java while throws keyword, used in method
 *     declaration, denoted which Exception can possible be 
 *     thrown by this method. ... The Throw clause can be used 
 *     in any part of code where you feel a specific exception 
 *     needs to be thrown to the calling method*/
public class throws_Java {
	
	static void fun() throws IllegalAccessException
	{
		System.out.println("Inside fun().");
		throw new IllegalAccessException ("dkdkdjdjdkdd");
	}
	public static void main(String[] args) {
		try
		{
			fun();
		}catch(IllegalAccessException e)
		{
			System.out.println("Caught in main.");
		}
	}

}
