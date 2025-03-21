import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="BookExample" height=600 width=1260>
</applet>
*/
public class BookExample extends Applet implements ActionListener
{
	Button rectangle,triangle,circle;
	int notify;
	public void init()
	{
		setBackground(Color.black);
		circle=new Button("Circle");
		triangle=new Button("Triangle");
		rectangle=new Button("Rectangle");
		add(circle);
		add(rectangle);
		add(triangle);
		circle.addActionListener(this);
		triangle.addActionListener(this);
		rectangle.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("Circle"))
			notify=1;
		else if(str.equals("Rectangle"))
			notify=2;
		else
			notify=3;
		repaint();
	}
	public void paint(Graphics g)
	{
		setBackground(Color.white);
		//g.setColor(Color.yellow);
		if(notify==1)
		{
			//g.fillOval(100,100,150,150);
			int x[]={228,404,574,512,411};
		int y[]={513,133,513,513,208};
		g.drawPolygon(x,y,5);
		g.setColor(Color.red);
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
		}
		else if(notify==2)
		{
			//g.fillRect(200,200,150,100);
			int x[]={228,404,574,512,411};
		int y[]={513,133,513,513,208};
		g.drawPolygon(x,y,5);
		g.setColor(Color.green);
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
		}
		else
		{
			if (notify==0)
			{
			}
			else
			{
			/*int x[]={500,1000,750,500};
			int y[]={500,500,250,500};
			g.fillPolygon(x,y,4);*/
			int x[]={228,404,574,512,411};
		int y[]={513,133,513,513,208};
		g.drawPolygon(x,y,5);
		g.setColor(Color.blue);
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
			
			}
		}
	}
	
}