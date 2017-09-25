package Lesson_6_Inheritance;

public class Triangle extends Shape{
	
	// SUB CLASS
	String style;
	double area()
	{ 
		return (getWidth() * getHeight()) / 2;
	}
	void showStyle()
	{
		System.out.println("The Style of Triangle is " + style);
	}
}
