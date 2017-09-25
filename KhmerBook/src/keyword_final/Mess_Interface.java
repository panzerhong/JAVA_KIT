package keyword_final;
/*We can extend the size of Interface by using the keyword
 * extends . When a class use interface which inherit from 
 * other interface , the interface which extends from other must use all the
 * method from child interface*/
interface A
{
	void method1();
	int method2();
	int ax = 10;
}
interface B extends A
{
	 void method3();
	int bx = 20;
}

class subclass implements B
{
	public void method1()
	{
		System.out.println("This is implement of Method 1");
		System.out.println("Value in interface A : "+ax);
	}
	public int method2()
	{
		System.out.println("This is implement of Method 2");
		int sum = ax+bx;
		System.out.println("The sum value of interface A and B");
		return sum;
	}
	@Override
	public void method3()
	{
		System.out.println("This is implement of Method 3");
	}
}
public class Mess_Interface extends subclass {
	public static void main(String[] args) {
		Mess_Interface obj = new Mess_Interface();
		obj.method1();
		System.out.print(obj.method2());
		obj.method3();
	}
}
