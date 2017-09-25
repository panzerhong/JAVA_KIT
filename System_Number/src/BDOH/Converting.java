package BDOH;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Converting {
	
	double dec=0;
	String oct;
	String bin;
	String hexa;
	
	short choice = 0;
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Converting mobj = new Converting();
		
		System.out.println("1. Binary");
		System.out.println("2. Decimal");
		System.out.println("3. Octal");
		System.out.println("4. Hexadecimal");
		
		System.out.println("Choose Number the Input Data Type : ");
		
		mobj.choice = s.nextShort();
		
		switch (mobj.choice)
		{
			case 1 :System.out.println("Enter the Binary : ");mobj.bin=s.next(); binary(mobj.bin); break;
			case 2 :System.out.println("Enter the Decimal : ");
					try{
						mobj.dec=s.nextDouble();
						decimal(mobj.dec);
						}
					catch(Exception e)
					{
						System.out.println("Your input is not Decimal, Decimal must not contain any special symbol or character, Pleas Try again");
					}
					break;
			case 3 :System.out.println("Enter the Octal :  ");mobj.oct=s.next();octal(mobj.oct);break;
			case 4 : System.out.println("Enter the Hexadecimal : ");mobj.hexa = s.next(); hexadecimal(mobj.hexa);break;
		default :
			System.out.println("Wrong Input Try again");
		}
	}

	protected static void hexadecimal(String hexa1) {
		try
		{
			long answerdecimal = Long.parseLong(hexa1,16);
			String answerbinary =  Long.toBinaryString(answerdecimal);
			String answeroctal = Long.toOctalString(answerdecimal);
			
			System.out.println(hexa1 + " Hexadecimal = "+ answerbinary+" Binary");
			System.out.println(hexa1 + " Hexadecimal = "+ answerdecimal+" Decimal");
			System.out.println(hexa1 + " Hexadecimal = "+ answeroctal+" Octal");
		}
		
		catch (NumberFormatException e)
		{
			System.out.println("Wrong Input Hexadecimal Number, Each character of Hexadecima must be from 0-9 & A-F Only, Please try again");
		}
		
	}

	protected static void octal(String oct1) {
		try{
		long answerdecimal = Long.parseLong(oct1,8);
		String answerbinary = Long.toBinaryString(answerdecimal);
		String answerhexadecimal = Long.toHexString(answerdecimal);
		
		System.out.println(oct1 + " Octal = "+ answerbinary+" Binary");
		System.out.println(oct1 + " Octal = "+ answerdecimal + " Decimal");
		System.out.println(oct1 + " Octal = "+ answerhexadecimal+" Hexadecimal");
		}
		catch (NumberFormatException e)
		{
			System.out.println("Wrong Input Octal Number, Each character of Octal must be from 0-8 Only, Please try again");
		}
		
	}

	protected static void decimal(double dec1) {
	
		String answerbinary = Integer.toBinaryString((int) dec1);
		String answeroctal = Integer.toOctalString((int) dec1);
		String answerhexadecimal = Integer.toHexString((int) dec1);
		
		System.out.println(dec1+" Decimal = "+ answerbinary+" Binary");
		System.out.println(dec1+" Decimal = "+ answeroctal+" Octal");
		System.out.println(dec1+" Decimal = "+ answerhexadecimal+" Hexadecimal");
	}	


	protected static void binary(String bin1) {
		try
		{
			long answerdecimal = Long.parseLong(bin1, 2);
			String answeroctal = Long.toOctalString(answerdecimal);
			String answerhexadecimal = Long.toHexString(answerdecimal);
			
			System.out.println(bin1 + " Binary = "+answerdecimal+" Decimal");
			System.out.println(bin1 + " Binary = "+answeroctal+" Octal");
			System.out.println(bin1 + " Binary = "+answerhexadecimal+ " Hexadecimal");
		}
		catch (NumberFormatException e)
		{
			System.out.println("You give the wrong Binary Number format , The Binary should be only 0 or 11//NumberFormatException//");
		}
		
	}
}
