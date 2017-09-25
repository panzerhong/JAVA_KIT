package Method_Overriding;

// Super class
class A
{
	int i, j,h;
	int a = 10, b = 20;
	A (int a, int b , int y )
	{
		i = a;
		j = b;
	 h = y;
	}
	
	void show()
	{
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		System.out.println("h = "+h);
	}
}

// Sub class
class B extends A
{
	int k;
	B(int a, int b, int c)
	{
		super(a,b,c);
		k = c;
	}
	void show(String msg)
	{
		System.out.println(msg + k);
	}
}


public class DemoOverrriding {
	public static void main(String[] args) {
		B obj = new B(6,4,7);
		obj.show();
		obj.show("k: ");
	}
}
