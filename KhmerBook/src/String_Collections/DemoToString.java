package String_Collections;

public class DemoToString {
	public static void main(String[] args) {
		Box obj = new Box(10,20,30);
		Box obj1 = new Box(1,2,3);
		
		String s = "Box b "+obj;// concatenation 
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(s);
	}
}

class Box
{
	double width , height , depth;
	Box (double w, double h , double d)
	{
		width = w;
		height = h;
		depth = d;
	}
	
	public String toString()
	{
		return "Dimensions are "+width +" by " + depth + " by "+height + ".";
	}
}