package keyword_final;

import java.util.Scanner;

public class Demo {
	
	protected final int y = 10;
	static final int y1 = 20;
	int y2 = 30;
	static int y3 = 40;
	
	public static void main(String[] args) {
		
		Demo obj = new Demo();
		MessageError sms = new MessageError();
		
		System.out.println("Before using modifying");
		System.out.println(sms.OUT_ERROR);
		System.out.println(sms.IN_ERROR);
		System.out.println(sms.DISKET_ERROR);
		System.out.println(sms.INDEX_ERROR);
		System.out.println(sms.str);
		System.out.println(sms.Q);
		
		System.out.println(obj.y);
		System.out.println(obj.y1);
		System.out.println(obj.y2);
		System.out.println(y3);
		System.out.println(obj.y3);
		y3 = 60;
		System.out.println("Static can modify "+ y3);
		
		
		System.out.println("Cannot modifying in class by adding");
		System.out.println("Result of sum = " + (sms.OUT_ERROR + sms.IN_ERROR+sms.DISKET_ERROR+sms.INDEX_ERROR));
		
		System.out.println("with final keyword we cannot modify the value of the final variable but we can assign value of final variable to other variable which is not final ");
		sms.OUT= 10;
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value of A an B : ");
		obj.y2 = s.nextInt();
		obj.y3 = s.nextInt();
		System.out.println("After Adding sum = "+sms.hello(obj.y2,obj.y3));
		
		System.out.println("After adding 4 and 5 is "+sms.hello(5,4));
		
	}
	
	public final int hi (int b1,int b2)
	{
		int multiply = b1 *b2;
		return multiply;
	}
}

class MessageError extends Demo
{
	Demo objsub = new Demo();
	MessageError bb = new MessageError();
	
	
	final int OUT_ERROR = 0;
	final int IN_ERROR = 1;
	final int DISKET_ERROR = 2;
	final int INDEX_ERROR =3;
	final String str = "Hello";
	final boolean Q = true;
	
	 int OUT = OUT_ERROR;
	 static float x = 2.5f;
	
	String[] sms ={"Output Error ","Input Error","Disk Full", "Index out of boutnd"};

	final int hello(int a1,int a2)
	{
		int sum = a1+a2;
		return sum;
	}
}
	
