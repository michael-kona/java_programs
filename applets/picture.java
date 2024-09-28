import java.awt.*;
import java.applet.*;
/*
<applet code="picture" width=500 height=500>
</applet>
*/
public class  picture extends Applet
{
	public void paint(Graphics g)
	{
        g.setColor(Color.gray); 
		g.fillOval(100,100,200,200);
		g.setColor(Color.blue);
		g.drawLine(200,170,200,230);
		g.setColor(Color.red);
		g.fillOval(150,150,20,20);
        g.fillOval(230,150,20,20);  
		g.drawLine(150,250,250,250);
	}
	
}
