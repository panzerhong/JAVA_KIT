package thisKEYWORD;

public class thiskeyword {
	
	public static void main(String[] args) {
		A s1 = new A(111,"ankit",5000.3f);
		A s2 = new A(112,"sumit",6000f);
		s1.display();
		s2.display();
	}
}

class B 
{
	int rollno=10;
	String name="tin";
	float fee=3.34f;
	
}

class A extends B
{
	
	A(int rollno, String name,float fee)
	{
		super.rollno = rollno;
		super.name = name;
		super.fee = fee;
	}
	
	void display()
	{
		System.out.println(rollno + " " +name + " " +fee);
	}
}