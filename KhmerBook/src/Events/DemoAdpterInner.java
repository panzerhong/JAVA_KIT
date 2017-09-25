package Events;
import java.awt.Frame;
import java.awt.event.*;
import java.awt.*;
 class DemoAdpterInner extends Frame {
	 DemoAdpterInner()
	{
		super("Demo Adpater inner!");
		setSize(400,300);
		addMouseListener(new MyMouseAdapter());
		addMouseMotionListener(new MyMouseMotionAdapter());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new DemoAdpterInner();
	
	}
	
	class MyMouseAdapter extends MouseAdapter
	{
		public void mouseClicked(MouseEvent me)
		{
			setTitle("Mouse clicked");
		}
	}
	
	class MyMouseMotionAdapter extends MouseMotionAdapter
	{
		public void mouseDragged(MouseEvent me)
		{
			setTitle("Mouse Dragged");
		}
	}

}
