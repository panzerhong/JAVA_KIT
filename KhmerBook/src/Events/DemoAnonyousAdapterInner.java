package Events;
/*Annonymous Adapter Inner Classses is class which has not name .
 * It help us to take it easy with coding of using event*/

import java.awt.*;
import java.awt.event.*;

public class DemoAnonyousAdapterInner extends Frame {
	DemoAnonyousAdapterInner()
	{
		super("Demo Anonymous Adpater inner");
		setSize(400,350);
		addMouseListener(new MouseAdapter()
				{
				public void mouseClicked(MouseEvent me)
				{
					setTitle("Mouse clicked!!1");
				}
				});
		
		addMouseMotionListener(new MouseMotionAdapter()
				{
			public void mouseDragged(MouseEvent me)
			{
				setTitle("Mouse clicked");
			}
				});
		addMouseMotionListener(new MouseMotionAdapter()
				{
				public void mouseDragged(MouseEvent me)
				{
					setTitle("Mouse dragged");
				}
				});
		
	}
	
	public static void main(String[] arg)
	{
		new DemoAnonyousAdapterInner();
	}
	 

}
