
public class MammalInt implements Animal{
	
	public void eat()
	{
		System.out.println("Mammal eats");
	}
	public void travel()
	{
		System.out.println("Mammal travels");
	}
	public void noOfLegs()
	{
		int x[]=new int [10];
		for(int i = 0;i<10;i++)
		{
			x[i]=1+i;
			System.out.println(x[i]);
		}
	}
	
	public static void main(String[] args) {
		MammalInt m = new MammalInt();
		m.eat();
		m.travel();
		m.noOfLegs();
	}
}
