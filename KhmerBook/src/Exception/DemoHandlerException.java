package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoHandlerException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean cont = true;
		do{
			System.out.println("Input integer Number");
			try 
			{
				int num = sc.nextInt();
				System.out.println("The number is "+num);
			}catch (InputMismatchException ex)
			{
				System.out.println("Try again sir! your input is not Integer");
				sc.nextLine();
				ex.printStackTrace();
				cont= false;
			}
			
		}while(cont);
	}

}
