import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;
/*
<applet code="MyApplet3" height=600 width=1260>
</applet>*/
public class MyApplet3 extends Applet implements MouseMotionListener
{
	int m=404,n=133;
	public void init()
	{
		addMouseMotionListener(this);
	}
	public void mouseDragged(MouseEvent me)
	{
		m+=10;
		n+=10;
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		m-=10;
		n-=10;
		showStatus("Mouse Moving at "+me.getX()+","+me.getY());
		repaint();
	}
	
	public void paint(Graphics g)
	{

		g.setColor(Color.red);
		g.drawOval(165,100,500,500);
		g.setColor(Color.white);
		g.fillOval(165,100,500,500);
		int x[]={228,m,574,512,411};
		int y[]={513,n,513,513,208};
		g.setColor(Color.red);
		g.drawPolygon(x,y,5);
		g.fillPolygon(x,y,5);
		g.setColor(Color.red);
		int x1[]={228,457,511};
		int y1[]={513,349,513};
		g.setColor(Color.darkGray);
		g.fillPolygon(x1,y1,3);
		int x2[]={492,590,575};
		int y2[]={326,250,513};
		g.fillPolygon(x2,y2,3);	
		g.setColor(Color.white);
		int x3[]={228,468,510,458};
		int y3[]={513,385,513,513};
		g.fillPolygon(x3,y3,4);
		int x4[]={508,554,535};
		int y4[]={362,330,422};
		g.fillPolygon(x4,y4,3);
		setBackground(Color.black);
	}
}

