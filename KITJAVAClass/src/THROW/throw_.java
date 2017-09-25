package THROW;

public class throw_ {
	void method () throws Exception 
	{
		Exception e = new Exception();
		throw e;// throwing an exception using throw'
	}

}

class throwsExample
{
	void methodOne() throws SQLException
	{
		// this method may throw SQLException
	}
	void methodTwo()throws IOException
	{
		// THis method may throw IOException
	}
	void methodThree()throws ClassNotFoundException
	{
		// This method may throw ClassNotFoundException
	}
}

class MyException extends Throwable
{
	// customized Exception class
}
class throwsE
{
	void method()throws MyException
	{
		MyException e = new MyException();
		throw e;
	}
}
	}
}