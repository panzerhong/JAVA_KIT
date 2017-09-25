package ObjectINjava;

public class staticMember {
	int y ;
	static int z=20;
	
	public static void main(String args[])
	{
		staticMember a;
		a= new staticMember();

		staticMember b = new staticMember();
		a.y=10;
		b.y=20;
		
		b.z=90;
		a.z=50;
	
		
		System.out.println(a.y);
		System.out.println(b.y);
		System.out.println(a.z);
		System.out.println(b.z);
		System.out.println(z);
		
		/*It has only one value of the variable , no matter we have created
		 * the different object reference to access and change the value of it
		 * */
		
		Adding.p=900;
		Adding.q=30;
		System.out.println("Addding "+Adding.add());// Access without using object reference because of the the method in class A use the keyword static
		
		Adding objAdd = new Adding();
		objAdd.r=170;
		objAdd.s=70;
		System.out.println("Substracting "+ objAdd.substract());
	}
}

class Adding
{
	static int p=10;// Allocate during the compile time
	static int q=20;
	static int add()
	{
		return p+q;
	}
	
	int r =90;// Allocate during the compile time too
	int s =70;
	int substract()
	{
		return r-s;
	}
}
/*ជាធមមត្ត member របស់ class មួយ ឬ របស់ object មួយ ទយើងអាចទរបើរបាស់វាបាន 
 * (access) ត្តមរយៈទ្មេះ object ដដលទយើងរបកាសវា ។ ប ុដនាទយើងក៏អាចទរបើរបាស់វា
 *  (members) ទោយផ្លេល់ ទោយពុំចាំបាច់ឆលងកាត់ object ទឡើយ គឺទយើងទរបើរបាស
 *   Static Member ។
 *   */
