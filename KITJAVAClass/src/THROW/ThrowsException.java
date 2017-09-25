package THROW;

import java.io.IOException;

class ThrowExample{
	void myMethod(int num) throws IOException, ClassNotFoundException
	{
		if(num==1)
			throw new IOException("IOException");
		else
			throw new ClassNotFoundException("ClassNoFoundException occur");
	}
}
public class ThrowsException extends ThrowExample {
	public static void main(String[] args) {
		try
		{
			ThrowExample obj = new ThrowExample();
			obj.myMethod(1);
		}
		catch (IOException e){
			System.out.println("This is Exception in IOexception"
					+ "");
		}
		catch (Exception ex)
		{
			System.out.println("This is the catch block of exception in main class");
		}
		
		
	}

}
