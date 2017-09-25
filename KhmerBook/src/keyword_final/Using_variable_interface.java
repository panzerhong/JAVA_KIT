package keyword_final;

interface MyConst{
	int MAX = 15;
	int MIN = 1;
	
	String SMSERROR = "Index Out of Bound";
}

public class Using_variable_interface implements MyConst {
	public static void main(String[] args) {
		int num [] = new int[MAX];
		for (int i = MIN ;i<23;i++)
		{
			if(i>MAX)
			{
				System.out.println("index out of bound");
			}
			else
				num[i] = i*i;
			System.out.println("num ["+i+"] = "+num[i]);
		}
	}

}
