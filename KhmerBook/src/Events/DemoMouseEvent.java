package Events;
/*To use mouse event we have to implement interfaces name MouseListener and MouseMotionListener*/
//import java.awt.Frame;
import java.awt.*;
import java.awt.event.*;
//import java.awt.Graphics;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.awt.event.MouseMotionListener;

/*In this, above example , class DemoMouseEvent inherit the feature from 
 * Frame class and implement on the  two interface ar MouseListener and MouseMotionListner
 * Frame is source and also listener for event . It can be processed because of
 * Coponent provide addMouseListener() and addMouseMotionListener() method and it is als the the
 * super class of Frame also
 * 
 * In the Constructor of DemoMouseEvent has noted its listener for mouse
 * events and it was created by using addMouseListener() and addMouseMotionListener()
 * its form :
 * 			synchronized void addMouseListener(MouoseListener ml)
 * 			synchronized void addMouseMotionListener(MouseMotionListener mml)
 * then Frame implement all the methods which are determined by MouseListener and MouseMotionListener interface.
 * This method is the user events for all of mouse events 
 * */


public class DemoMouseEvent extends Frame implements MouseListener,MouseMotionListener
{
	String sms = "";
	String str = "Mouse Events";
	int mouseX=0,mouseY = 0;
	private String s="-";
	
	DemoMouseEvent()
	{
		super("Demo Mouse Events ");
		setSize(300,250);
		addMouseListener(this); 
		addMouseMotionListener(this);
		setVisible(true);
	}
	
	
	public void mouseClicked(MouseEvent me) {
		sms="Mouse clicked , at x = "+me.getX()+"and Y=" +me.getY();
		setTitle(sms);
	}
	

	public void mouseEntered(MouseEvent me) {
		mouseX = 0;
		mouseY = 0;
		sms="Mouse has Entered in the window content";
		setTitle(sms);
	}


	
	public void mouseExited(MouseEvent me) {
		mouseX = 0;
		mouseY = 0;
		sms="Mouse has Exited out of the window content";
		setTitle(sms);
	}
	

	public void mousePressed(MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		sms="Mouse has Pressed Down**";
		setTitle(sms);
		
	}
	
	public void mouseReleased(MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
		sms="Mouse has Up**";
		setTitle(sms);
	}
	
	public void mouseDragged(MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		s="*";
		str ="Mouse dragging at : "+mouseX+","+mouseY;
		repaint();
		
	}
	
	public void mouseMoved(MouseEvent me) {
		str = "Mouse has moved to "+me.getX()+","+me.getY();
		repaint();
		setTitle(sms);
	}
	
	// display sms in applet window at current x,y
	public void paint(Graphics g)
	{
		g.drawString(s,mouseX,mouseY);
		g.drawString(str,mouseX,mouseY);
	}

	public static void main(String[] args) {
		new DemoMouseEvent();
	}
}

/*ចូរពិនិតយទមើលឧទហរណ្៍ខាងទលើ ទយើងទឃើញថា class DemoMouseEvent ទទួលលកខណ្ៈពី F
 * rame class ទហើយ implements ទៅទលើ interface ពីរ គឺ MouseListener និង MouseMotionListener។ Frame 
 * គឺជា source ទហើយក៏ជា listener សរមាប់ event ទំងទនេះ។ វាអាចដំទណ្ើរការបានទោយសារ Component ជាអនកផាល់នូវ addMouseListener() និង addMouseMotionListener() method ទហើយក៏ជា superclass របស់ Frame ដដរ។ ទៅខាងកនុង Constructor របស់ DemoMouseEvent កត់រត្តខលួនវាជា listener សរមាប់ mouse events ។ វាទធវើទឡើងទោយទរបើ addMouseListener() និង addMouseMotionListener() ។*/
 