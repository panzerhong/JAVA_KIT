// Filename: Sports.java
public interface Sports {
   public void setHomeTeam(String name);
   public void setVisitingTeam(String name);
   
   public default void hello()
   {
	   System.out.println("Hello from interface Sports");
   }
}
   




