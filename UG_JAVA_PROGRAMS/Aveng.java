import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;
/*
<applet code="Aveng" height=600 width=1260>
</applet>*/
public class Aveng extends Applet implements MouseMotionListener
{
	public void init()
	{
		addMouseMotionListener(this);
	}
	public void mouseDragged(MouseEvent me)
	{
	}
	public void mouseMoved(MouseEvent me)
	{
		showStatus("Mouse Moving at "+me.getX()+","+me.getY());
	}
	public void paint(Graphics g)
	{
		setBackground(Color.red);
		g.setColor(Color.black);
		int x[]={410,460,485,515,500,470,435,410};
		int y[]={505,220,220,325,320,250,505,505};
		g.drawPolygon(x,y,8);
		g.fillPolygon(x,y,8);
		int x1[]={450,498,498,520,498,498,448,450};
		int y1[]={328,328,322,330,339,333,333,328};
		g.drawPolygon(x1,y1,8);
		g.fillPolygon(x1,y1,8);
		int x2[]={500,500,515,520,500};
		int y2[]={350,340,335,350,350};
		g.drawPolygon(x2,y2,5);
		g.fillPolygon(x2,y2,5);
		g.drawOval(395,245,200,200);
	}
}