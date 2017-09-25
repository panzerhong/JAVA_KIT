package Lesson_6_Inheritance;

public class Triangle_1 extends Shape_1 {
	String style;
	
	public Triangle_1(String s, double d, double e) {	// This is the constructor of the triangle which has 3 parameters.
		// TODO Auto-generated constructor stub
		style = s;
		setWidth(d);
		setHeight(e);
	}

	double area()
	{
		return(getWidth()*getHeight())/2;
	}
	
	void showStyle()
	{
		System.out.println("The Style of Triangle is "+style);
	}	
}
