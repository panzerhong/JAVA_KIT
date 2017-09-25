package Collection;
import java.util.*;
public class DemoArray {

	
	public static void main(String[] args) {
		int [] array = new int [10];
		for(int i=0;i<10;i++)
		{
			array[i] = -5*i;
		}
		
		// display then sort and display again
		System.out.println("Original contents : ");
		display(array);
		Arrays.sort(array);
		System.out.println("Sorted : ");
		display(array);
		
		//fill and display // Arrays.fill(array,start_index,end_index,value_to_replace);
		Arrays.fill(array,2,6,-1);
		System.out.println("After fill() : ");
		display(array);
		// sort and display
		Arrays.sort(array);
		System.out.println("After again");
		display(array);
		
		// binay search for -15
		System.out.println("the value -15 in location : ");
		int index = Arrays.binarySearch(array, -15);
		System.out.print (index);
	}

	 static void display(int[] array) {
		// TODO Auto-generated method stub
		 
		 for(int i = 0;i<array.length;i++)
		 {
			 System.out.println(array[i] + " ");
			
		 }
	}
}
