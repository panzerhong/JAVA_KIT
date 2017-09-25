
public class Sport_java implements Hockey{
	public static void main(String[] args) {
		Sport_java obj = new Sport_java();
		Hockey objhoc = new Sport_java();
		
		objhoc.homeGoalScored();
		
		obj.hello();
		String nameinmain= "String Name in MAIN";
		obj.setHomeTeam(nameinmain);
		
	}

	@Override
	public void setHomeTeam(String name) {
		String s = "Hello from setHomeTeam - ";
		System.out.println(s+name);
	}

	@Override
	public void setVisitingTeam(String name) {
		// TODO Auto-generated method stub
	}

	@Override
	public void homeGoalScored() {
		// TODO Auto-generated method stub
		System.out.println("Hello From HomeGoalScored");
		
	}

	@Override
	public void visitingGoalScored() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void endOfPeriod(int period) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void overtimePeriod(int ot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void homeTeamScored(int points) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitingTeamScored(int points) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void endOfQuarter(int quarter) {
		// TODO Auto-generated method stub
		
	}
}
