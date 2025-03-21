import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="MoonCircle" width=1024 height=1024>
</applet>
*/
public class MoonCircle extends Applet 
{
int n=0;
	int X=10,Y=20;
	public void change()
	{
		for(int i=10;i<20;i++)
		{
			X=X+2;
repaint();				
		}
			
	}
	public void paint(Graphics g) 
	{
		
		setBackground(Color.black);
		g.setColor(Color.yellow);
		g.drawOval(X,Y,100,100);
		g.fillOval(X,Y,100,100);
		while(n<5)
		{
			change();
			n++;
		}
		/*g.setColor(Color.black);
		g.drawOval(X+10,Y,100,100);
		g.fillOval(X+10,Y,100,100);*/
	}
	
}