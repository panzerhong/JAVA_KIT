package Inheritance;
import java.util.*;
public class Child_Class extends Parrent_Class{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		Child_Class objchild = new Child_Class();
		System.out.println(" Enter the value of public");
		objchild.pub = s.nextInt();
		System.out.println("Enter the value of protected");
		objchild.pro = s.nextInt();
		System.out.println("We cannot use private in another class");
		System.out.println("A private member is only acccessible"
				+ " within the same class as it is declared . "
				+ "A member with no access modifier is only accessible within classes"
				+ " in the same package. A protected member is accessible within all classes "
				+ "in the same package and within subclasses in other package");
		
	}
}
