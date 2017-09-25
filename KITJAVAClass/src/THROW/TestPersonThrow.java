package THROW;

import java.io.IOException;
import java.nio.channels.AlreadyBoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestPersonThrow {
	private int salary = 0;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		TestPersonThrow obj = new TestPersonThrow();
		try
		{
			obj.salary = s.nextInt();
			ss(obj.salary);
		}catch (Exception e)
		{
			System.out.println("Catch in main method");
		}
		
		
	}
	
	public static void ss (int sss)
	{
		if(sss>100)
			throw new RuntimeException("Salary cannot be more than 100");
		else
			System.out.println("Right");
		
	}

}
