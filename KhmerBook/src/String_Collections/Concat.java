package String_Collections;

public class Concat {
	public static void main(String[] args) {
		int age = 29;
		String defString = "String : A class used to "
				+ "represent textual information"
				+ "The string class includes many methods"
				+ "for operating on string objects . java"
				+ "overloads the operator for"
				+ "string concatenation	";
		
		String myName = "My name is BUN SEIHAK. I'm "
				+age+" years old";
		
		System.out.println(defString);
		System.out.println(myName);
		
		System.out.println("Very importation ! Be careful");
		String number4 ="four : "+2+2;
		
		System.out.println("The result : "+number4);
		String number44= "four : "+(2+2);
		
		System.out.println("The result : "+number44);
		
		String str = "Hello";
		System.out.println("String length : "+str.length());
		
		char ch[] = {'C','H','A','R'};
		System.out.println("char length : "+ch.length);
	}

}
