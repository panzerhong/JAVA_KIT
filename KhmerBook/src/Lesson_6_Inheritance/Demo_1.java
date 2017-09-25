package Lesson_6_Inheritance;

public class Demo_1 {
	
	public static void main(String[] args) {
		
		Triangle_1 obj = new Triangle_1("isolence",5.0,8.0);
		
		System.out.println("All Information of Object");
		obj.showStyle();
		obj.showWH();
		System.out.println("The Area = "+obj.area());
	}
}

/*All Information of Object
 *The style of Triangle is isolence 
 *Width = 5 and Height = 8
 *The Area = 3*/
 