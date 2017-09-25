package BDOH;

import java.io.FileNotFoundException;

public class ThrowAndThrowsAssertions {
	public void sayHello(int a) throws Exception
	{
		if(a<100)
		{
			System.out.println("Hello");
		}
		else
			throw new Exception();// throw use to throw the 
	}

}
