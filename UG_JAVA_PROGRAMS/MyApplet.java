import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;
public class MyApplet extends Applet implements MouseMotionListener,MouseListener
{
	String msg;
	int MouseX,MouseY;
	int sign,x,y;
	public void init()
	{
		addMouseMotionListener(this);
		addMouseListener(this);
		//BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		try{
		setBackground(Color.white);
		
		Font f=new Font("Sans Serif",Font.BOLD,25);
		setFont(f);
		msg="Home";
		//System.out.println("Enter House Name:");
		//msg=x.readLine();
		}
		catch(Exception e){ System.out.println(e);}
	}
	public void mouseClicked(MouseEvent me)
	{
		sign=1;
		x=me.getX();
		y=me.getY();
		repaint();
		
	}
	public void mousePressed(MouseEvent me)
	{
	}
	public void mouseReleased(MouseEvent me)
	{
	}
	public void mouseEntered(MouseEvent me)
	{
	}
	public void mouseExited(MouseEvent me)
	{
	}
	public void mouseDragged(MouseEvent me)
	{
	}
	public void mouseMoved(MouseEvent me)
	{
		MouseX=me.getX();
		MouseY=me.getY();
		repaint();
	}
	public void paint(Graphics g)
	{
		/*setBackground(Color.cyan);
		setForeground(Color.black);
		g.drawString(msg,200,180);
		g.drawLine(180,150,180,370);
		g.drawLine(180,150,440,150);
		g.drawLine(440,150,440,370);
		g.drawLine(180,370,440,370);
		g.drawLine(180,150,310,50);
		g.drawLine(440,150,310,50);
		g.drawLine(200,200,200,370);
		g.drawLine(200,200,300,200);
		g.drawLine(300,200,300,370);
		g.drawLine(330,210,390,210);
		g.drawLine(330,210,330,250);
		g.drawLine(330,250,390,250);
		g.drawLine(390,210,390,250); 
		g.setColor(Color.red);
		g.fillRect(180,150,260,220);
		setForeground(Color.blue);
		g.drawOval(530,60,100,100);
		g.drawOval(285,80,50,50);*/
		g.drawString("Mouse Moving at "+MouseX+","+MouseY,MouseX,MouseY);
		if(sign==1)
			g.fillOval(x,y,10,10);
			
		
	}
}
/*<applet code="MyApplet" height="600" width="1000"></applet>*/
