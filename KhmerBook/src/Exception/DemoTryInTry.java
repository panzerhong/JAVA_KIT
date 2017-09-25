package Exception;

import java.io.PrintStream;

public class DemoTryInTry {
	public static void main(String[] args) {
		
		int num[] = {4,8,16,32,64,128};
		int divide [] = {4,8,0,32,64,128};
		try
		{
			for(int i = 0;i<num.length;i++)
			{
				try
				{
					System.out.println(num[i] + "/"+divide[i]+"="+num[i]/divide[i]);
				}
				catch(ArithmeticException ex)
				{
					System.out.println("Cannnot divide by Zero");
					PrintStream s = null;
					ex.printStackTrace(s);
				}
			}
		}catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("No match element found!");
		}
	}
}
