package Collection;

import java.util.ArrayList;
import java.util.Scanner;
/*We can convert ARRAYLIST  to ARRAY by using method toArray();
 * the reason to convert  are : 
 * Quick Operation
 * 
 * Transfer array to method which doesn't operate the overloaded
 * for getting particular collection
 * 
 * Append more code which is based on the collection and have new acivity
 * to old code which is not yet recognized by collection
 * */
public class Array_ArrayList {
	
	public static void main(String[] args) {
		
		// Create an array list
		ArrayList al = new ArrayList();
		
//		// Get the input from the user and store the data in array list al
//		Scanner s = new Scanner(System.in);
//		al =s.nextLine();
		
		al.add(new Integer (1));
		al.add(new Integer (2));
		al.add(new Integer (3));
		
		System.out.println("Contents of al : "+al);
		
		Object ia[] = al.toArray();
		int sum =0;
		// sum the Array
		for(int i = 0;i<ia.length;i++)
		{
			sum += ((Integer)ia[i]).intValue();
		}
		System.out.println(sum);
		
	}

}
