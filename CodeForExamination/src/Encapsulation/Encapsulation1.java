package Encapsulation;
/*Encapsulation in Java is a mechanism of wrapping the data(variable) and code acting on the data(method) together as a single unit*/

/*below example , the variable private is not accessible within other class
 * but we can access with is by using public method
 * Fields name,age,salary are made DATA HIDDEN fields using encapsulation in OPPS*/
public class Encapsulation1 {
	public static void main(String[] args) {
		
		
		employee obj = new employee();
		obj.setname("yinmazatin");
		obj.setage(19);
		obj.setsalary(1000);
		
		System.out.println(obj.getname());
		System.out.println(obj.getage());
		System.out.println(obj.getsalary());
		
	}
}

class employee
{
	
	private String name;
	private int age;
	private int salary;
	
	public void setname(String newvalue)
	{
		name = newvalue;
	}
	public void setage(int newvalue)
	{
		age = newvalue;
	}
	public void setsalary(int newvalue)
	{
		salary = newvalue;
	}
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}
	public int getsalary()
	{
		return salary;
	}
	
}
