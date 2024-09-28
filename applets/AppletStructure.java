/*	An applet to understand the
applet life cycle and its basic structure*/

import java.awt.*;
import java.applet.Applet;

/*
<applet code="AppletStructure" width="90" height="100">
</applet>
*/

public class AppletStructure extends Applet
{
   public void init() 
      {
      System.out.println("initializing");
	  try
            {
	    Thread.sleep(9000);
            }
          catch(InterruptedException e){}
      } // init
   
   public void start() 
      {
      System.out.println("starting");
      try
        {
	 Thread.sleep(9000);
	}
      catch(InterruptedException e){}
      }// start
   
   public void paint(Graphics g) 
      {
      System.out.println("painting");
      g.drawString("Hello World!", 30, 30);
      } // paint
   
   public void stop() 
     {
      System.out.println("stopping");
     }// stop
  }// AppletStructure
