import java.awt.*;
import java.applet.Applet;
public class  ParamPass extends Applet
{
String str;
public void init()
	{
	str=getParameter("aaa");
	if(str==null)
		str="garden city";
	else
		str=str+"bangalore city";
	}
	public void paint(Graphics g)
	{
		g.drawString(str,100,100);
	}
}
