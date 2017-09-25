package Exception;

public class Array_Exception {
	public static void main(String[] args) {
		
		try
		{
			int i = 3;
			int a[] = new int [5];
			for(i = 0;i<9;i++)
			{
				a[i]=i+i;
				System.out.println(a[i]);
			}
		}catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Hey Index out of bound dude!");
//			ex.printStackTrace();
//			ex.printStackTrace();
//			ex.addSuppressed(ex);
//			ex.getMessage();
		}
		System.out.println("After catch execute");
	}
}
