package Exception;

import java.util.Scanner;

/*We can use keyword throws behind declaration method
 * we use it to list all kind of exception that the method
 * can throw it away. It is important for all exceptions 
 * except error group, runtimeException, and subclass 
 * 
 * 
 * SYNTAX
 * Return-type method-name (parameter-list) throws exception-list
 * {
 * 		//body of method
 *	}
 **/
public class keyword_throws {
	
	public static char prompt (String str) throws java.io.IOException
	{
		System.out.println(str+" : ");
		return (char) System.in.read();
	}
	
	public static double operate(int a,int b) throws java.io.IOException
	{
		int res = a/b;
		return res;
	}
	public static void main(String[] args) {
		char ch;
		double sum=0;
		Scanner s = new Scanner(System.in);
		keyword_throws obj = new keyword_throws();
		int num[] = new int[5];
		int div[] ={2,3,4,0,9};
		double sumdiv[] = new double [5];
		try
		{
			ch = prompt ("Enter a letter ");
		}catch(java.io.IOException ex)
		{
			System.out.println("I/O exception occurred");
			ch = 'X';
		}
		System.out.println("You press "+ch);
		
		try
		{
			for(int j = 0;j<10;j++)
			{
				System.out.println("Input number");
				num[j] =s.nextInt();
				double resprototype = obj.operate(num[j],div[j]);
				sumdiv[j] = sumdiv[j]+resprototype;
				System.out.println("After dividing Result = "+sumdiv[j]);
			}
		}
		catch(java.io.IOException ex1)
		{
			System.out.println("There is something during your processing");
		}

	}
}
