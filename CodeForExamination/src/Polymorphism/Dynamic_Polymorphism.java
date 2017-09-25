package Polymorphism;
/*Stataic polymorphism in java is achieved by method overloading
 * Dynamic polymorphism in java is achieved by method overriding
 * An object in java passses a minimum of two IS-A tests is polymorphic in nature
 * 
 * POLYMORPHISM IS THE CONCEPT OF OPP WHICH AN OBJECT CAN TAKE MANY FORM */
public class Dynamic_Polymorphism {
	public static void main(String args[])
	{
		fruit f = new food();
		f.appl();
		f = new fruit();
		f.appl();
	}

}

class fruit
{
	protected int x;
	//private int y;
	public int z;
	public void appl()
	{
		System.out.println("The block code in subclass apple");
	}
}

class food extends fruit
{
	public void apple()
	{
		x = 10;
		//y = 100;
		z = 200;
		System.out.println(x+z);
	}	
}
