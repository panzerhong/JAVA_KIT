package Package_Interface;
public interface Series
{
	int getNext();// show the next number
	void reset();// reset
	void setStart(int x);// set the number to be start
}

public class Access_modifier {
	interface Driveable
	{
		boolean startEngine();
		void stopEngine();
		float accelerate(float acc);
		boolean turn (String direction);
	}

}
