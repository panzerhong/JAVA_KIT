package Lesson_6_Inheritance;

public class Demo {
	
	public static void main(String[] args) {
		Triangle obj = new Triangle ();
		obj.setWidth(20);
		obj.setHeight(10);
		obj.style = " isosceles "; 
		System.out.println(" All Information of Object "); 
		obj.showStyle(); 
		obj.showWH();
		System.out.println("The Area = "+obj.area());
	}
}
/*	All Information of Object
 * The style of Triangle is isosceles.
 * Width = 4 and Height = 5
 * The area of Triangle is 10
 * 
 * 
 * All Information of Object
 * The style of Triangle is isosceles
 * Width = 4 and Height = 5 
 * */
 
