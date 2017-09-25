package Package_Interface;

 class Using_interface extends Access_modifier implements Series{
	int start;
	int val;
	Using_interface()
	{
		start = 10;
		val = 20;
	}
	@Override
	public int getNext() {
		// TODO Auto-generated method stub
		val+=2+start;
		return val;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		start = 0;
		val = 0;
	}

	@Override
	public void setStart(int x) {
		// TODO Auto-generated method stub
		start = x ;
		val = x;
		
	}
	public static void main(String[] args) {
		Using_interface obj = new Using_interface ();
		//obj.getNext();
	
		for(int i = 0;i<3;i++)
		{
			System.out.println(obj.getNext());
			obj.reset();
			obj.setStart(22);
			
		}
		
		
	}
}
/*To use interface in other class we have to use the word
 * IMPLEMENTS after the name of those class.
 * If we have many interfaces in a class , we have to discrete them 
 * by using ,comma.
 * 
 * GENERAL FORMULAR OF CLASS which IMPLEMENTS on the Interface
 * 
 * access class class_name extends superclass implement interface
 * {
 * 		//body
 * }
 * */
