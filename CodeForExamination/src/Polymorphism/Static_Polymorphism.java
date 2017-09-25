 package Polymorphism;
 
 /*Static polymorphism is achieved through method overloading. Method overloaing means there are serveral
  * methods present in a class haveing the same name but different types /order/ number of parameters.*/

public class Static_Polymorphism {
	
	public static void main(String args[])
	{
		Static_Polymorphism obj = new Static_Polymorphism();
		
		System.out.println(	obj.add(20,30));
		System.out.println(obj.add(100,20,30));
	}
	
	public int add(int x,int y)
	{
		int sum = x+y;
		return  sum;
	}
	public double add(double a,double b,double c)
	{
		return a+b+c;
	}
}
