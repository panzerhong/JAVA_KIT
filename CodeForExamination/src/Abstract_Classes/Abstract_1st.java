package Abstract_Classes;
/*Abstract class are classes that contain one or more abstract methods.
 * abstract methods is any method which is decleared with abstract keyword but contain no implementation
 * and abstract class cannot be instantiated or create the object.
 * it require the subclasses to provide implementations for the abstract method*/
public class Abstract_1st {
	
	public static void main(String args[])
	{
		c obj = new c();
		a obja = new c();
		
		
		obj.print_infor();
		
		System.out.println(obj.sum(2,3));
		System.out.println(obj.a1+obj.a2);
	}

}


abstract class a 
{
	int a1=20,a2=80;
	static String b = "hello in abstract a";
	public void print_infor()
	{
		System.out.println("Statement in Abstract class a"+b);
	}
	
}

class c extends a
{
	@Override
	public void print_infor()
	{
		System.out.println("Statement in Class C");
	}
	
	public int sum(int num1,int num2)
	{
		return num1 + num2;
	}
}
