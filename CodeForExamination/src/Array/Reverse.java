package Array;
import java.util.*;
public class Reverse {
	int x[];
	int i,q;
	
		public static void main(String args[])
	{
		Reverse obj = new Reverse();
		obj.x= new int[30];
		Scanner objscan = new Scanner(System.in);
		
		
		System.out.println("Enter the quantity of array : ");
		obj.q=objscan.nextInt();
		
		System.out.println("Enter the value of array");
		for(obj.i=1;obj.i<=obj.q;obj.i++)
		{
			obj.x[obj.i] = objscan.nextInt();
		}
		
		System.out.println("Before Reverse ");
		for(obj.i=1;obj.i<=obj.q;obj.i++)
		{
			System.out.println(obj.x[obj.i]);
		}
		
		System.out.println("After Reverse : ");
		for(obj.i=obj.q;obj.i>=1;obj.i--)
		{
			System.out.println(obj.x[obj.i]);
		}
	}
}
