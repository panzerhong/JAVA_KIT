package builder_Project;

public class BuilderPatternDemo {
	
	static Student stud;
	public static void main(String[] args)
	{
		stud = new Student.StudentBuilder()
				.setId(1234)
				.setName("XYZ");
				.setEmail("xyz@gail.cllc");
				.getInstance();
				
				System.out.println(stud);
	}

}
