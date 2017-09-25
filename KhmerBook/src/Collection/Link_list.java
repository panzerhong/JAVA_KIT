package Collection;
/*LinkedList class inherit the AbstractSequentialList and practice List Interface*/

// The form of constructor 
// LinkedList()
// LinkedList(Collection c)
/*void add(Object obj)
 * void add(int inde, Object obj)
 * 
 * void add(Object obj)
 *  void add(int index , Object obj)
 *   void addFirst(Object obj)
 *    void addLast(Object obj)
 *     void set(Object obj) Object get(int index)
 *      Object getFirst() 
 *      Object getLast() 
 *      Object removeFirst()
 *       Object removeLast()*/

import java.util.*;
public class Link_list {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.add("H");
		ll.add("E");
		ll.add("L");
		ll.add("L");
		ll.add("O");
		ll.add("A");
		ll.add("B");
		ll.add("A");
		
		ll.addLast(" ");
		ll.addLast("!");
		
		ll.addFirst("ZATIN ");
		
		ll.add(1,"h");
		ll.add(2,"GG");
		
		System.out.println("Original contents of ll : "+ll);
		// remove from left to right
		
		ll.remove("A");
		ll.remove("A");
		//ll.remove("h");
		System.out.println("Content of ll after deleted : "+ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Content of ll after remove First and Last : "+ll);
		Object val = ll.get(2);
		
		ll.set(2, (String)val+"Changed");
		System.out.println("ll after changed : "+ll);
	}

}
