package super_keyword;
// Super keyword is used in sub class to call the member of super class
// Super class
class A 
{
	int i;
}

// Sub class
class B extends A
{
	int i;
	B(int a, int b)// Constructor of sub class
	{
		super.i = a;
		i = b;
	}
	void show()
	{
		System.out.println("i in super class : "+super.i);
		System.out.println("in in sub class : "+i);
		
	}
}

public class DemoSuper {
	public static void main(String[] args) {
		B obj = new B (99,555);
		obj.show();
	}

}
