import java.awt.*;
import java.applet.*;
/*
<applet code="sample" width="100" height="100">
</applet>
*/
public class  sample extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("hello",10,10);
		g.drawLine(10,10,100,100);
	}
	
}



/*
execute
c:/>javac sample.java
c:/>appletviewer sample.java
*/