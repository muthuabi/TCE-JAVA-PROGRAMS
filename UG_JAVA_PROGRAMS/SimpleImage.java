/*
<applet code="SimpleImage" width=248 height=146>
<param name="img" value="mine.jpeg">
</applet>
*/
import java.awt.*;
import java.applet.*;
public class SimpleImage extends Applet
{
Image img;
public void init() 
{
img = getImage(getDocumentBase(), getParameter("img"));
}
public void paint(Graphics g) 
{
g.drawImage(img, 0, 0, this);
}
}