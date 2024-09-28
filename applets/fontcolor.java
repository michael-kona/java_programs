import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.applet.Applet;
/*
<applet code="fontcolor" width=100  height=100>
</applet>
*/
public class fontcolor extends Applet
{
public void paint(Graphics g)
	{
	Font f1=new Font("TimesRoman",Font.BOLD,20);
	g.setColor(Color.red);
	g.setFont(f1);
	g.drawString("Hi",10,20);
	
	Font f2=new Font("Arial",Font.ITALIC,28);
 	g.setColor(Color.blue);
	g.setFont(f2);
	g.drawString("Hello",10,40);
	
               Font f3=new Font("Courier",Font.BOLD+Font.ITALIC,72);
	g.setColor(Color.green);
	g.setFont(f3);
	g.drawString("How r u",10,60);

	}
}

