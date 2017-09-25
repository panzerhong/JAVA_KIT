package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {
	
	/*ArrayList class inherit the feature from AbstractList
	 * and use List interface. 
	 * 
	 * ArrayList provide dynamic arrays which mean it can expand the size automatically 
	 * for the requirement and different from the simple array in java
	 * when we declare the array we cannot expand or compact
	 * 
	 * For arrayList operation is automatically expand and compact by itself*/
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a[] = new int [5];
		for(int i = 0;i<5;i++)
		{
			a[i]=s.nextInt();
			System.out.println("After getting input");
			System.out.println(a[i]);
		}
		
		// Create an array list
				ArrayList al = new ArrayList();
				System.out.println("Initial size of al : "+al.size());
				
		// add element to array list
				al.add("C");
				al.add("A");
				al.add("M");
				al.add("B");
				al.add("A");
				System.out.println("Size of al after add element : "+al.size());
				//display the array list
				System.out.println("Content of al : "+al);
				// to remove elements from the arraylist
				al.remove("A");
				al.remove(0);
				System.out.println("Size of al after deleted : "+al.size());
				System.out.println("Content of al : "+al);
	}
}
