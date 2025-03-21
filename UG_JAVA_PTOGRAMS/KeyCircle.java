import java.awt.*;
import java.awt.event.*;
import java.applet.*;/*
<applet code="KeyCircle" width=1024 height=1024>
</applet>*/
public class KeyCircle extends Applet  implements KeyListener
{
	String msg = "";
	int X = 10, Y = 20;
	int h= 100, w=100;
	int X1=10;// output coordinates
	public void init() 
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke) 
	{
		showStatus("Key Down");
		int key = ke.getKeyCode();
		switch(key)
		{
			case KeyEvent.VK_UP:
				Y = Y-10; 
				if(Y<=0)
					Y=10;
				break;
			case KeyEvent.VK_DOWN:
				Y = Y+10;
				if(Y>=600)
					Y=590;
				break;
			case KeyEvent.VK_LEFT:
				X = X-10;
				if(X<=0)
					X=10;
				
				break;
				
			case KeyEvent.VK_RIGHT:
				X=X+10;
				if(X>=900)
					X=890;
				break;
		}
		repaint();
	}
	public void keyReleased(KeyEvent ke) 
	{
		showStatus("Key Up");
	}
	public void keyTyped(KeyEvent ke)
	{
		msg += ke.getKeyChar();
		repaint();
	}
	public void paint(Graphics g) 
	{
		setBackground(Color.black);
		g.setColor(Color.yellow);
		//showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
		//g.drawString(msg, X, Y);
		g.drawOval(X,Y,100,100);
		g.fillOval(X,Y,100,100);
		
		g.setColor(Color.black);
		g.drawOval(X1+10,Y,100,100);
		g.fillOval(X1+10,Y,100,100);
	}
}