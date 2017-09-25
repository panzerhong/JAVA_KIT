package Collection;

import java.util.Vector;

/*Vector has the same feature as dynamic array
 * and it is similar to ArrayList too but the different
 * is Vector has synchronized feature and has many methods
 which is not in the group of collection
 
 *Constructor of Vector
 *Vector()
 *Vector(int size)
 *Vector(int size,int incr)
 *Vector(Collection c)
 *
 *incr is the increasing of vector when Vector expand the size
 *if not instantiate , the default value for vector is 10
 */
public class DemoVector {
	
	public static void main(String[] args) {
		//intial size of vector is 3 and increment by 2
		Vector v = new Vector(3,2);
		System.out.println("Initial size : "+v.size());
		System.out.println("intial capacity : "+v.capacity());
		
		v.addElement(new Integer(10));
		v.addElement(new Integer(20));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		System.out.println("Capacity after added 4 : "+v.capacity());
		
		v.addElement(new Double(4.5));
		System.out.println("Current Capacity : "+v.capacity());
		
		v.addElement(new Integer(9));
		v.addElement(new Float(6.08));
		System.out.println("Current Capacity : "+v.capacity());
		System.out.println("Current capacity after add float element : "+v.capacity());
	}

}
