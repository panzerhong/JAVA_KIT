
abstract class Demo {
	 public void Demo1 ()
	{
		System.out.println("This is Concrete Method in Abstract Class Demo");
	}
	 abstract protected void Demo2();
}

class parent extends Demo
{
	@Override
	public void Demo1()
	{
		System.out.println("I am overriding the method Demo from Abstract method");
	}

	public void Demo2()
	{
		System.out.println("Overriding the abstract method from abstract Class Demo");
	}
}
public class Abstract_Concrete extends parent{
	public static void main(String args[])
	{
		Abstract_Concrete obj = new Abstract_Concrete();
	//	Abstract_Concrete obj1 = (Abstract_Concrete) new parent(); Cannot accessible
		parent objparent = new parent();
		parent objparent1 = new Abstract_Concrete();
		
		objparent1.Demo1();
		objparent.Demo1();
		
		objparent1.Demo2();
//		objparent.Demo1();
//		obj.Demo1();
	}
	
	public void Demo1()
	{
		System.out.println("I am overriding the function Demo1");
		System.out.println("Hellow from Demo1 in the Main Class");
		
	}
}
