package Lesson_6_Inheritance;

public class Shape_1 {
	private double width;
	private double height;
	
	double getWidth()
	{
		return width=2;
	}
	double getHeight()
	{
		return height=3;
	}
	
	void setWidth(double w){
		width = w;
	}
	void setHeight(double h)
	{
		height = h;
	}
	
	void showWH()
	{
		System.out.println("Width = "+width +"and Height = "+height);
	}
}
