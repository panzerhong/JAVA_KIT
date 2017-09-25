package Lesson_6_Inheritance;

public class Shape {
	
	//SUPER CLASS
	private double width=4;
	private double height=5;
	double getWidth()
	{
		return width;
	} 
	double getHeight()
	{ 
		return height;
	}
	Void setWidth( double w)
	{
		width = w;
		return null; 
	}
	Void setHeight( double h)
	{
		height = h;
		return null; 
	} 
	void showWH()
	{
		System.out.println("Width = "+width+"height = "+height);
	}
}
