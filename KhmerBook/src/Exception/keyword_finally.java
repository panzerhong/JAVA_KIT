package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*In java we use TRY and CATCH to catch the error and force the control
 * to leave from the block of code but sometime in block of code 
 * we open file or connection and not yet close it then it has 
 * error , therefore, in any programming language require us to close
 * the file or connection back. 
 * 
 *In that condition java provide a convenient method to*/

// General syntax of using finally keyword
/*
 * try
 * {
 * 		//block of code ot monitor for error
 * } catch (ExceptionType1 ex)
 * {
 * 		//handler for exeception type 1
 * }catch(ExceptionType2 ex)
 * {
 * 		//handler for exception type 2
 * }
 * finally
 * {
 * 		//finally code
 * }
 * */
public class keyword_finally {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num[] = new int[5];
		int div[] ={2,3,4,0,9};
		int i;
		double sum=0;
		keyword_finally obj = new keyword_finally ();
		
		try
		{
			for(int j = 0;j<10;j++)
			{
				System.out.println("Input number");
				num[j] =s.nextInt();
				double result= num[j]/div[j];
				sum =sum+result;
			}
		}catch(ArithmeticException ex)
		{
			ex.printStackTrace();
			ex.getMessage();
		}catch(ArrayIndexOutOfBoundsException ex1)
		{
			ex1.printStackTrace();
			ex1.getMessage();
		}catch(InputMismatchException ex2)
		{
			ex2.printStackTrace();
			ex2.getMessage();
		}
		finally
		{
			System.out.println("Leaving from catch block");
		}
		System.out.println("Result of sum = "+sum);
	}
}
