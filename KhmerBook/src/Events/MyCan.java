package Events;
import java.awt.*;
import java.awt.event.*;
public class MyCan {
	
	public static void main(String[] args) {
		Frame f = new Frame("Paint Example");
		f.add(new MainCanvas(), BorderLayout.CENTER);
		f.setBounds(200,300,60,90);
		f.show();
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}

}

class MainCanvas extends Canvas
{
	int x,y;
	int lastX=0,lastY=0;
	
	MainCanvas()
	{
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent me)
			{
				x = me.getX();
				y = me.getY();
				lastX = x;
				lastY= y;
				
			}
		});
		
		addMouseMotionListener(new MouseMotionAdapter(){
			
			public void mouseDragged(MouseEvent me)
			{
				Graphics g = getGraphics();
				x=me.getX();
				y=me.getY();
				g.drawLine(lastX, lastY, x, y);
				lastX = x;
				lastY = y;
			}
		});
	}
	
	public void paint(Graphics g)
	{
		setBackground(Color.green);
		g.setColor(Color.blue);
		g.drawOval(0, 0, getSize().width-1, getSize().height-1);
	}
}
