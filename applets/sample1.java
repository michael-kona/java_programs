 import java.awt.*;
//importing awt (Abstract window ToolKit) package to use graphics class
import java.applet.*;
//importing applet package

public class  sample1 extends Applet
{
	public void paint(Graphics g)//overridding paint() of Applet class
	{
		g.drawLine(10,10,100,100);
		g.drawOval(100,100,50,50);
		g.drawString("hello how r u",10,200);
	}
	
}
