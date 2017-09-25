package Lesson_6_Inheritance;

public class DemoSupperRef {
	
	
	public static void main(String[] args)
	{
		DemoSupperRef obj = new DemoSupperRef();
		B objB = new B();
		objB.print();
	}

}

class B extends A
{
	void print()
	{
		System.out.println("Value in superclass " + i);
	}
}
class A 
{
	int i = 10;
}





