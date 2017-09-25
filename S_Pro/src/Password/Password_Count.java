package Password;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


class variable
{
	public int choice=0;
	protected int i = 0;
}



class Input_element extends variable
{
	int func_Input()
	{
		System.out.println("Enter the password element");
		Scanner s = new Scanner(System.in);
		
		choice=s.nextInt();
		if(choice<=9)
		{
			return choice;
		}
		else
			System.out.println("The password is not allowed for more than 9 digit");
		return choice;
		
	}
}



class choice extends Input_element
{
	void choosing(int choice) throws Exception
	{
		switch (choice)
		{
		case 1:	operate1();break;
		case 2:	operate2();break;
		case 3:	operate3();break;
		case 4:	operate4();break;
		case 5:	operate5();break;
		case 6:	operate6();break;
		case 7:	operate7();break;
		case 8:	operate8();break;
		case 9:	operate9();break;
			
		}
	}
	
	void operate1()throws Exception
	{
		try
		{
			for(i=0;i<10;i++)
			{
					System.out.println(i); 
					Thread.sleep(50);
			}	
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	void operate2()throws InterruptedException
	{
		try
		{
			for(i=0;i<100;i++)
			{
				if(i<10)
				{
					System.out.print(0);
				}
				System.out.println(i);
				Thread.sleep(50);
			}	
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	void operate3()throws Exception
	{
		try
		{
			for(i=0;i<1000;i++)
			{
				if(i<10)
				{
					System.out.print("00");
				}
				else if(i>=10&&i<100)
				{
					System.out.print(0);
				}
				System.out.println(i); 
				Thread.sleep(50);
			}
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	void operate4()throws Exception
	{
		try
		{
			for(i=0;i<10000;i++)
			{
				if(i<10)
				{
					System.out.print("000");
				}
				else if(i>=10&&i<100)
				{
					System.out.print("00");
				}
				else if(i>=100&&i<1000)
				{
					System.out.print("0");
				}
				System.out.println(i);
				Thread.sleep(50);
			}
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	void operate5()throws Exception
	{
		try
		{
			while(i<100000)
			{
				if(i<10)
				{
					System.out.print("0000");
				}
				else if(i>=10&&i<100)
				{
					System.out.print("000");
				}
				else if(i>=100&&i<1000)
				{
					System.out.print("00");
				}
				else if(i>=1000&&i<10000)
				{
					System.out.println("0");
				}
				System.out.println(i);
				i++;
				Thread.sleep(50);
			}
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	void operate6()throws Exception
	{
		try
		{
			while(i<1000000)
			{
				if(i<10)
				{
					System.out.print("00000");
				}
				else if(i>=10&&i<100)
				{
					System.out.print("0000");
				}
				else if(i>=100&&i<1000)
				{
					System.out.print("000");
				}
				else if(i>=1000&&i<10000)
				{
					System.out.println("00");
				}
				else if(i>=10000&&i<100000)
					System.out.println("0");
				System.out.println(i);
				i++;
				Thread.sleep(50);
			}
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	void operate7() throws Exception
	{
		try
		{
			while(i<10000000)
			{
				if(i<10)
				{
					System.out.print("000000");
				}
				else if(i>=10&&i<100)
				{
					System.out.print("00000");
				}
				else if(i>=100&&i<1000)
				{
					System.out.print("0000");
				}
				else if(i>=1000&&i<10000)
				{
					System.out.println("000");
				}
				else if(i>=10000&&i<100000)
					System.out.println("00");
				else if(i>=100000&&i<1000000)
					System.out.println("0");
				System.out.println(i);
				i++;
				Thread.sleep(50);
			}
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	void operate8() throws Exception
	{
		try
		{
			do
			{
				if(i<10)
				{
					System.out.print("0000000");
				}
				else if(i>=10&&i<100)
				{
					System.out.print("000000");
				}
				else if(i>=100&&i<1000)
				{
					System.out.print("00000");
				}
				else if(i>=1000&&i<10000)
				{
					System.out.println("0000");
				}
				else if(i>=10000&&i<100000)
					System.out.println("000");
				else if(i>=100000&&i<1000000)
					System.out.println("00");
				else if(i>=1000000&&i<10000000)
				{
					System.out.println("0");
				}
				System.out.println(i);
				TimeUnit.SECONDS.sleep(500);
				i++;
				Thread.sleep(50);
			}while(i<100000000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	void operate9() throws Exception 
	{
		try
		{
			do
			{
				if(i<10)
				{
					System.out.print("00000000");
				}
				else if(i>=10&&i<100)
				{
					System.out.print("0000000");
				}
				else if(i>=100&&i<1000)
				{
					System.out.print("000000");
				}
				else if(i>=1000&&i<10000)
				{
					System.out.println("00000");
				}
				else if(i>=10000&&i<100000)
					System.out.println("0000");
				else if(i>=100000&&i<1000000)
					System.out.println("000");
				else if(i>=1000000&&i<10000000)
				{
					System.out.println("00");
				}
				else if(i>=10000000&&i<100000000)
					System.out.println("0");
				System.out.println(i);
				i++;
				Thread.sleep(50);
				
			}while(i<1000000000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	
	}
}


public class Password_Count {
	
	public static void main(String[] args) {
		Password_Count mobj = new Password_Count();
		
		// Create the object reference for sub_class Input_element
		Input_element objIt = new Input_element();
		int ch = objIt.func_Input();// Access to the function func_Input in subclass Input_element
		
		// Create the object reference for sub_class choice
		try
		{
			choice objce = new choice();
			objce.choosing(ch);// Access to the function choosing in subclass choice
		}catch (Exception e)
		{
			System.out.println("Sorry there is some problem during execution");
			System.out.println("Please try again later");
		}
		
		
	}

	
}
